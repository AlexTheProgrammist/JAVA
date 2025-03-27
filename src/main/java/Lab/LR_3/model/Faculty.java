package Lab.LR_3.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private final String name;
    private final Human head;
    private final List<Department> departments;

    public Faculty(String name, Human head) {
        this.name = name;
        this.head = head;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public List<Department> getDepartments() {
        return new ArrayList<>(departments);
    }

    @Override
    public String toString() {
        return "Faculty: " + name + ", Head: " + head.getFullName() + ", Departments: " + departments.size();
    }
}
