package Lab.LR_3.model;

import java.util.ArrayList;
import java.util.List;

public class University {
    private final String name;
    private final Human head;
    private final List<Faculty> faculties;

    public University(String name, Human head) {
        this.name = name;
        this.head = head;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public List<Faculty> getFaculties() {
        return new ArrayList<>(faculties);
    }

    @Override
    public String toString() {
        return "University: " + name + ", Head: " + head.getFullName() + ", Faculties: " + faculties.size();
    }
}
