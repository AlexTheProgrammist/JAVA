package Lab.LR_3.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final String name;
    private final Human head;
    private final List<Student> students;

    public Group(String name, Human head) {
        this.name = name;
        this.head = head;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    @Override
    public String toString() {
        return "Group: " + name + ", Head: " + head.getFullName() + ", Students: " + students.size();
    }
}
