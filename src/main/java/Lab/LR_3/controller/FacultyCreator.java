package Lab.LR_3.controller;

import Lab.LR_3.model.*;

public class FacultyCreator {
    public static Faculty create(String title, Human leader) {
        return new Faculty(title, leader);
    }
}
