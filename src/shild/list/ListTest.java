package shild.list;

import java.util.Date;
import java.util.Scanner;

public class ListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataStorage storage = new DataStorage();
        AdverBase add = new AdverBase();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Put 0 for exit");
            System.out.println("Put 1 for log in");
            System.out.println("Put 2 for Registration");
            System.out.println("Put 3 for delete");
            String scanData = scanner.nextLine();
            switch (scanData) {
                case "0":
                    isRun = false;
                    System.out.println("program is exit");
                    break;
                case "1":
                    System.out.println("Please input data for log in");
                    String logData = scanner.nextLine();
                    String logInData[] = logData.split(",");
                    String log = logInData[0];
                    String pass = logInData[1];
                    if (storage.getUserByLogIn(log) == null) {
                        System.out.println("Invalid login");
                    } else if (!storage.getPassByLogIn(log).equals(pass)) {
                        System.out.println("Invalid password");
                    } else {

                        System.out.println("Welcome to system   " + storage.getNameByUserNames(logInData[0]));
                        User mek = storage.getUserByLogIn(log);
                        boolean isRunTwo = true;
                        while (isRunTwo) {
                            System.out.println("Put 0 for exit");
                            System.out.println("Put 1 for add ad");
                            System.out.println("Put 2 for print all ads");
                            System.out.println("Put 3 for print my ads");
                            System.out.println("Put 4 for print by type");
                            System.out.println("Put 5 for change Password");
                            String command = scanner.nextLine();
                            switch (command) {
                                case "0":
                                    isRunTwo = false;
                                    break;
                                case "1":
                                    System.out.println("Please enter your add's title,type,address");
                                    String adData = scanner.nextLine();
                                    String adsData[] = adData.split(",");
                                    Advertisement1 aDV = new Advertisement1(adsData[0], adsData[1], adsData[2], new Date(), mek);
                                    add.addAdver(aDV);
                                    break;

                                case "2"://asdasd
                                    System.out.println("All ads! ");
                                    add.printAdvers();
                                    break;

                                case "3":
                                    System.out.println("This is your adds");
                                    add.printMyAdvers(mek);
                                    break;

                                case "4":
                                    String type = scanner.nextLine();
                                    System.out.println("by Type");
                                    add.printByType(type);

                                    break;
                                case"5":
                                    System.out.println("");



                            }


                        }
                    }
                    break;
                case "2":
                    System.out.println("Please input data for registration name, surname, username, password");
                    String regData = scanner.nextLine();
                    String registrData[] = regData.split(",");
                    storage.registration(registrData[0], registrData[1], registrData[2], registrData[3]);
                    break;
                case "3":
                    System.out.println("please input logIn for delete");
                    String delete = scanner.nextLine();
                    storage.deleteUserbyLogIn(delete);


            }


        }

    }
}

