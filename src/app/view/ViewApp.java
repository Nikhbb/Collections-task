package app.view;

import app.entity.User;

import java.util.List;
import java.util.Scanner;

public class ViewApp {
    public void printMenu() {
        System.out.println("\nMENU\n0-exit\n1-print all users\n2-print one user");
    }

    public void printCollection(List<User> users) {
        int i = 1;
        System.out.println("\nPrint all users:");
        for (User element : users) {
            System.out.println(i + ") " + element);
            i++;
        }
    }

    public void printUserToIndex(List<User> users, int index) {
        System.out.println("\nPrint one user:");
        try {
            System.out.println(index + ") " + users.get(index - 1));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("You must enter an index from 1 to " + users.size());
        }
    }

    public int getMenuNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your choose: ");
        return sc.nextInt();
    }

    public int getIndex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input index: ");
        return sc.nextInt();
    }
}
