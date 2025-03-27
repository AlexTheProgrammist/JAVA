package Lab.LR_3.controller;

import Lab.LR_3.model.*;

public class StudentCreator {
    public static Student create(String first, String last, String middle, Sex gender) {
        return new Student(first, last, middle, gender);
    }
}
