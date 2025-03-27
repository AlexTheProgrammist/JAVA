package Lab.LR_3.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String name;
    private final Human head;
    private final List<Group> groups;

    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
        this.groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public List<Group> getGroups() {
        return new ArrayList<>(groups);
    }

    @Override
    public String toString() {
        return "Department: " + name + ", Head: " + head.getFullName() + ", Groups: " + groups.size();
    }
}
