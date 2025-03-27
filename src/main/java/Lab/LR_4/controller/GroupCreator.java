package Lab.LR_4.controller;

import Lab.LR_4.model.*;

public class GroupCreator {
    public static Group create(String title, Human leader) {
        return new Group(title, leader);
    }
}
