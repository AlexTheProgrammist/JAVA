package Lab.LR_4.controller;

import Lab.LR_4.model.*;
import Lab.LR_4.utils.JsonManager;
import com.github.javafaker.Faker;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Random;

public class Run {
    private static final String FILE_PATH = Paths.get(
            "D:", "SAVE", "IdeaProjects", "Java_basic", "src", "test", "resources", "university.json").toString();

    public static void main(String[] args) throws IOException {
        Faker faker = new Faker();
        Random random = new Random();

        System.out.println("=== Initializing University ===");

        Human universityHead = generateRandomHuman(faker, random);
        University university = new University("Tech University", universityHead);
        System.out.println("University Created: " + university);

        Faculty facultyIT = new Faculty("Information Technology Faculty", generateRandomHuman(faker, random));
        Faculty facultyEng = new Faculty("Engineering Faculty", generateRandomHuman(faker, random));
        university.addFaculty(facultyIT);
        university.addFaculty(facultyEng);

        Department deptSE = new Department("Software Engineering", generateRandomHuman(faker, random));
        Department deptCS = new Department("Cybersecurity", generateRandomHuman(faker, random));
        facultyIT.addDepartment(deptSE);
        facultyIT.addDepartment(deptCS);

        Department deptEE = new Department("Electrical Engineering", generateRandomHuman(faker, random));
        Department deptME = new Department("Mechanical Engineering", generateRandomHuman(faker, random));
        facultyEng.addDepartment(deptEE);
        facultyEng.addDepartment(deptME);

        Group groupA = new Group("122-21-2", generateRandomHuman(faker, random));
        Group groupB = new Group("122-22-1", generateRandomHuman(faker, random));
        deptSE.addGroup(groupA);
        deptSE.addGroup(groupB);

        Group groupC = new Group("121-21-1", generateRandomHuman(faker, random));
        Group groupD = new Group("121-22-1", generateRandomHuman(faker, random));
        deptCS.addGroup(groupC);
        deptCS.addGroup(groupD);

        for (Group group : new Group[]{groupA, groupB, groupC, groupD}) {
            group.addStudent(generateRandomHuman(faker, random));
            group.addStudent(generateRandomHuman(faker, random));
        }

        System.out.println("\n=== Saving University to JSON ===");
        JsonManager.writeToJsonFile(university, FILE_PATH);

        System.out.println("\n=== Loading University from JSON ===");
        University loadedUniversity = JsonManager.readFromJsonFile(FILE_PATH);

        System.out.println("Loaded University: " + loadedUniversity);

        if (university.equals(loadedUniversity)) {
            System.out.println("The universities are identical.");
        } else {
            System.out.println("The universities are different.");
        }
    }

    private static Student generateRandomHuman(Faker faker, Random random) {
        return new Student(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.name().firstName(), // Father’s name (simulated)
                random.nextBoolean() ? Sex.MALE : Sex.FEMALE,
                "STU-" + (100 + random.nextInt(900))
        );
    }
}