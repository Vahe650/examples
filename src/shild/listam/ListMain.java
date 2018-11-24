package shild.listam;
import shild.listam.exception.MyEx;
import shild.listam.model.Advertisment;
import shild.listam.model.User;
import shild.listam.storage.AdvStorage;
import shild.listam.storage.UserStorage;

import java.util.Date;
import java.util.Scanner;

public class ListMain {
    static UserStorage userStorage = new UserStorage();
    static AdvStorage advStorage = new AdvStorage();
    static Scanner scanner = new Scanner(System.in);
    static User currentUser = null;

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            try {
                printUserCommands();
                int userCommands = Integer.parseInt(scanner.nextLine());

                switch (userCommands) {
                    case 0:
                        isRun = false;
                        break;
                    case 1:
                        logIn();
                        break;
                    case 2:
                        registration();
                        break;
                    case 3:
                        userNotFoundException();
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("please input valid number");
            }
        }
    }

    private static void userNotFoundException() {
        System.out.println("PLEASE ENTER USERNAME");
        String name=scanner.nextLine();
        try {
            userStorage.searchUserByUsername(name);
        } catch (MyEx myEx) {
            System.out.println("INVALID USER");
        }


    }

    private static void logIn() {
        System.out.println("PLEASE ENTER YOUR LOGIN AND PASSWORD");
        String usernameAndPassword = scanner.nextLine();
        String[] logData = usernameAndPassword.split(",");
        User user = userStorage.getUserByUsernameAndPassword(logData[0], logData[1]);
        if (user == null) {
            System.out.println("WRONG USERNAME OR PASSWORD");
        } else System.out.println("YOU ARE LOGGED IN");
        currentUser = user;
        list();
    }


    private static void list() {
        boolean logedIn = true;
        while (logedIn) {
            printListCommands();
            int listcommands = Integer.parseInt(scanner.nextLine());
            switch (listcommands) {
                case 0:
                    logedIn = false;
                    currentUser = null;
                    System.out.println("YOU ARE LOGGED OUT");
                    break;
                case 1:
                    addAd();
                    break;
                case 2:
                    printAllAdvers();

                    break;
                case 3:
                    printMyAdvers();
                    break;
                case 4:
                    printAdverByType();
                    break;

            }
        }

    }

    public static void printAllAdvers() {
        advStorage.printAllAdvers();

    }

    public static void printMyAdvers() {
        advStorage.printAdversByUser(currentUser);
    }

    private static void printAdverByType() {
        System.out.println("PLEASE ENTER YOUR ADVERTISMENT");
        String type = scanner.nextLine();
        advStorage.prindAdverByType(type);

    }

    private static void addAd() {
        System.out.println("PLEASE ENTER TITLE,DESK,TYPE,PRICE");
        String adverStr = scanner.nextLine();
        String[] adverData = adverStr.split(",");
        Advertisment adver = new Advertisment(adverData[0], adverData[1], adverData[2], Double.parseDouble(adverData[3]), new Date(), currentUser);
        advStorage.addAdver(adver);
        System.out.println("THANK YOU,ADVERTISMENT IS ADDED");

    }

    public static void registration() {
        System.out.println("PLEASE ENTER YOUR NAME,SURNAME,USERNAME,PASSWORD");
        String userStr = scanner.nextLine();
        String[] userData = userStr.split(",");
        boolean bob = userStorage.dupUsername(userData[2]);
        while (bob) {
            System.out.println("this login is already exist");
            System.out.println("please enter another login");
            String logTwo = scanner.nextLine();
            boolean newBob = userStorage.dupUsername(logTwo);
            if (!newBob) {
                bob = false;
                User nor = new User(userData[0], userData[1], logTwo, userData[3]);
                userStorage.add(nor);
            } else {
                bob = true;
            }
        }
        User nor=new User(userData[0],userData[1],userData[2],userData[3]);
        userStorage.add(nor);
        System.out.println("THANK YOU FOR REGISTRATION");

    }

    private static void printUserCommands() {
        System.out.println("ENTER 0 FOR EXIT");
        System.out.println("ENTER 1 FOR LOG IN");
        System.out.println("ENTER 2 FOR REGISTRATION");
        System.out.println("ENTER 3 FOR SEARCH USER");
    }

    private static void printListCommands() {
        System.out.println("ENTER 0 FOR LOG OUT");
        System.out.println("ENTER 1 FOR ADD ADVERTISEMENT");
        System.out.println("ENTER 2 FOR PRINT ALL ADVERTISEMENT");
        System.out.println("ENTER 3 FOR PRINT MY ADVERTISMENTS");
        System.out.println("ENTER 4 FOR PRINT ADVERTISMENT BY TYPE");
    }
}
