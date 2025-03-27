package Lab.LR_3.controller;

import Lab.LR_3.model.*;

public class DepartmentCreator {
    public static Department create(String title, Human leader) {
        return new Department(title, leader);
    }
}
