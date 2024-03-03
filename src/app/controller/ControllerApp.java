package app.controller;

import app.entity.User;
import app.model.ModelApp;
import app.view.ViewApp;

import java.util.List;

public class ControllerApp {
    private List<User> users;
    private final ViewApp viewApp = new ViewApp();
    private final ModelApp modelApp = new ModelApp();

    public void run() {
        users = modelApp.initList();
        int menuNumber;

        do {
            viewApp.printMenu();
            menuNumber = viewApp.getMenuNumber();

            switch (menuNumber) {
                case 0:
                    System.out.println("See you.");
                    break;
                case 1:
                    viewApp.printCollection(users);
                    break;
                case 2:
                    viewApp.printUserToIndex(users, viewApp.getIndex());
                    break;
                default:
                    System.out.println("Enter 0 for EXIT");
            }
        } while (menuNumber != 0);
    }

}
