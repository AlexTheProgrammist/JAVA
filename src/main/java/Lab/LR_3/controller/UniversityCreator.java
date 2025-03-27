package Lab.LR_3.controller;

import Lab.LR_3.model.*;

public class UniversityCreator {
    public static University create(String title, Human leader) {
        return new University(title, leader);
    }
}
