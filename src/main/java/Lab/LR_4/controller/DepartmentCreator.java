package Lab.LR_4.controller;

import Lab.LR_4.model.*;

public class DepartmentCreator {
    public static Department create(String title, Human leader) {
        return new Department(title, leader);
    }
}
