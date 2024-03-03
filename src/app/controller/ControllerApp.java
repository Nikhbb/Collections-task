package app.controller;

import app.model.User;
import app.view.ViewApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerApp {
    private List<User> users;
    private final ViewApp viewApp = new ViewApp();

    public void run() {
        initList();
        int menuNumber;

        do {
            viewApp.printMenu();
            menuNumber = getMenuNumber();

            switch (menuNumber) {
                case 0:
                    System.out.println("See you.");
                    break;
                case 1:
                    viewApp.printCollection(users);
                    break;
                case 2:
                    viewApp.printUserToIndex(users, getIndex());
                    break;
                default:
                    System.out.println("Enter 0 for EXIT");
            }
        } while (menuNumber != 0);
    }

    private void initList() {
        users = new ArrayList<>();
        users.add(0, new User("Ann", "ann@gmail.com"));
        users.add(1, new User("Ivan", "ivan@ukr.net"));
        users.add(2, new User("Jon", "jon@i.ua"));
        users.add(3, new User("Tom", "tom@gmail.com"));
        users.add(4, new User("Fox", "fox@gmail.com"));
    }

    private int getMenuNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your choose: ");
        return sc.nextInt();
    }

    private int getIndex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input index: ");
        return sc.nextInt();
    }
}
