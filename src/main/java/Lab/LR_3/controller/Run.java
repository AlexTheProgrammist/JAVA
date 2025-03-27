package Lab.LR_3.controller;

import Lab.LR_3.model.*;

public class Run {
    public static void main(String[] args) {
        System.out.println("=== Initializing University ===");

        Human universityHead = new Student("John", "Smith", "Andrew", Sex.MALE);
        University university = UniversityCreator.create("Global Tech Institute", universityHead);
        System.out.println("Created: " + university);

        System.out.println("\n=== Adding Faculty ===");
        Human facultyHead = new Student("Emma", "Brown", "Liam", Sex.FEMALE);
        Faculty faculty = FacultyCreator.create("Computer Engineering", facultyHead);
        university.addFaculty(faculty);
        System.out.println("Added: " + faculty);

        System.out.println("\n=== Adding Department ===");
        Human departmentHead = new Student("Michael", "Davis", "Sophia", Sex.MALE);
        Department department = DepartmentCreator.create("AI Research", departmentHead);
        faculty.addDepartment(department);
        System.out.println("Added: " + department);

        System.out.println("\n=== Adding Group ===");
        Human groupHead = new Student("Lucas", "Garcia", "Mason", Sex.MALE);
        Group group = GroupCreator.create("AI-101", groupHead);
        department.addGroup(group);
        System.out.println("Added: " + group);

        System.out.println("\n=== Adding Student ===");
        Student student = StudentCreator.create("Olivia", "Wilson", "Ethan", Sex.FEMALE);
        group.addStudent(student);
        System.out.println("Added: " + student);

        System.out.println("\n=== Final Structure ===");
        System.out.println(university);
    }
}
