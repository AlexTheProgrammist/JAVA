package Lab.LR_3.controller;

import Lab.LR_3.model.*;

public class GroupCreator {
    public static Group create(String title, Human leader) {
        return new Group(title, leader);
    }
}
