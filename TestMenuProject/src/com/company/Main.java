package com.company;
import java.util.Scanner;

public class Main {
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Main myApp = new Main();

        System.out.println("Welcome to Appalachia Resort!");

        myApp.loginMenu();
        int choice = myApp.input.nextInt();

        switch (choice) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
                myApp.exitOption();
                break;
            case 0:
                myApp.mainMenuAdmin();
                choice = myApp.input.nextInt();

                switch (choice) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        myApp.exitOption();
                        break;
                }
        }
    }

    private void mainMenuCust() {
        System.out.println("-----Main menu-----");
        System.out.println("1. Book a room");
        System.out.println("2. Check-in");
        System.out.println("3. Check out");
        System.out.println("4. Edit your booking info");
        System.out.println("5. View history");
        System.out.println("6. Go to your profile");
        System.out.println("9. Exit");
        System.out.println();
        System.out.print("Enter choice: ");
    }

    private void mainMenuAdmin() {
        System.out.println("*****Admin menu*****");
        System.out.println("1. List of all customers");
        System.out.println("2. Room information");
        System.out.println("3. Available room");
        System.out.println("4. Add rooms");
        System.out.println("5. Edit info of existing rooms");
        System.out.println("6. Remove room");
        System.out.println("7. Add new customer");
        System.out.println("8. Search for booking");
        System.out.println("9. Exit");
        System.out.println();
        System.out.print("Enter choice: ");
    }

    private void exitOption() {
        System.out.println();
        System.out.println("Are you sure you wish to exit?");
        System.out.println("1: Yes or 2: No");
        System.out.println();
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Farewell!");
            System.exit(0);
        } else if (choice == 2) {
            System.out.println("Returning to main menu.");
        }
    }

    private void loginMenu() {
        String pass;
        String username;

        System.out.print("Enter username: ");
        username = input.nextLine();
        System.out.print("Enter password: ");
        pass = input.next();

        while(username==){
            if (username.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) {
                System.out.println("Admin login accessed. Entering menu...");
                System.out.println();
                mainMenuAdmin();

            } else {
                System.out.println("Wrong username or password entered. Try again!");
            }
        }
    }
}