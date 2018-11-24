package shild.educationCenter;


import shild.educationCenter.model.*;
import shild.educationCenter.storage.LessonStorage;
import shild.educationCenter.storage.MessageStorage;
import shild.educationCenter.storage.StudentStorage;
import shild.educationCenter.storage.UserStorage;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import static java.awt.SystemColor.text;
import static java.awt.SystemColor.textText;

public class EducationCenter implements EducationCommand {

    static final Scanner SCANNER = new Scanner(System.in);
    static final StudentStorage STUDENT_STORAGE = new StudentStorage();
    static final LessonStorage LESSON_STORAGE = new LessonStorage();
    static final UserStorage USER_STORAGE=new UserStorage();
    static final MessageStorage MESSAGE_STORAGE=new MessageStorage();
    private static String EMAIL=null;

    public static void main(String[] args) {
        User user=new User("Vahe","Simonyan","vvv","sss","admin");
        USER_STORAGE.add(user);
        boolean start=true;
        while (start){
            priintLogCommand();
            int com;
            try {
                com=Integer.parseInt(SCANNER.nextLine());
            }catch (NumberFormatException e){
                com=-1;
            }
            switch (com){
                case -1:
                    System.out.println("please input valid number");
                    break;
                case 0:
                    start=false;
                    break;
                case 1:
                    logInUser();
            }
            }



    }

    private static void logInUser() {
        System.out.println("please input email and pass for log In");
        String str=SCANNER.nextLine();
        String[]logData=str.split(",");
        String email=logData[0];
        String password=logData[1];
        if(USER_STORAGE.getUserByUsernameAndPassword(email,password).getType().equalsIgnoreCase("Admin")){
            System.out.println("admin");
            boolean isRun = true;
            while (isRun) {
                printEducationCommands();
                int command;
                try {
                    command = Integer.parseInt(SCANNER.nextLine());
                } catch (NumberFormatException e) {
                    command = -1;
                }
                switch (command) {
                    case -1:
                        System.out.println("Please input a number");
                        break;
                    case EXIT:
                        isRun = false;
                        break;
                    case ADD_LESSON:
                        addLesson();
                        break;
                    case ADD_STUDENT:
                        addStudent();
                        break;
                    case PRINT_LESSONS:
                        LESSON_STORAGE.printLessons();
                        break;
                    case PRINT_STUDENTS:
                        STUDENT_STORAGE.printStudents();
                        break;
                    case CHANGE_STUDENT_LESSONS:
                        changeStudentLessons();
                        break;
                    case PRINT_STUDENT_BY_LESSON_NAME:
                        printStudentByLessonName();
                        break;
                    default:
                        System.out.println("Please input a valid Command");
                }

            }
        }
        else if(USER_STORAGE.getUserByUsernameAndPassword(email,password)!=null){
            System.out.println("user");
            boolean isRain=true;
            while (isRain){
                printUserCommands();
                int coms;
                coms=Integer.parseInt(SCANNER.nextLine());
                switch (coms){
                    case EXIT:
                        isRain=false;
                        break;
                    case CHANGE_PASSWORD:
                        changePassword(email);
                        break;
                    case CHANGE_MY_LESSON:
                        changeMyLesson();
                        break;
                    case PRINT_MY_LESSONS:
                        printMyLessons(email);
                        break;
                    case CHANGE_MY_DATA:
                        changeMyPhone();
                        break;
                    case SEND_MESSAGE:
                        sendMessage();
                        break;
                    case VIEW_ALL_MESSAGES:
                     viewAllMessages(logData[0]);

                        break;
                }
            }

        }
        else {
            System.out.println("no user");
        }

    }

    private static void viewAllMessages(String to) {
        if(MESSAGE_STORAGE.getMessageFromUser(to)!=null){
            MESSAGE_STORAGE.getMessageByEmail(EMAIL);
            System.out.println(to);
            System.out.println(EMAIL);
        }


    }


    private static void sendMessage() {
        STUDENT_STORAGE.printAllStudentsName();
        System.out.println("please input email for sending message");
       String to=SCANNER.nextLine();
       if (USER_STORAGE.getUserByUsername(to)!=null){
           System.out.println("write a Message");
       String text=SCANNER.nextLine();
        Message message=new Message(EMAIL,to,text,new Date(),false);
        MESSAGE_STORAGE.add(message);
        System.out.println("sending...");

        }else System.out.println("NO!!! user");




    }

    private static void changeMyPhone() {
        System.out.println("please input old phone number");
        String old=SCANNER.nextLine();
        System.out.println("please input new phone number");
        String newNumber=SCANNER.nextLine();
        STUDENT_STORAGE.changePhoneNumber(old,newNumber);
    }

    private static void printMyLessons(String username) {
        STUDENT_STORAGE.printMyLessons(username);



}

    private static void changeMyLesson() {
        System.out.println("please input old lesson name");
        String lessonName=SCANNER.nextLine();
        System.out.println("please input new lesson name");
        String newLessonName=SCANNER.nextLine();
        STUDENT_STORAGE.changeLesson(lessonName,newLessonName);





    }

    private static void changePassword(String email) {
        System.out.println("please input old password");
        String old=SCANNER.nextLine();
        System.out.println("now type new password");
        String nor = SCANNER.nextLine();
        USER_STORAGE.changePassword(old,nor,email);
    }

    private static void priintLogCommand() {
        System.out.println("please input "+EXIT+" for exit");
        System.out.println("please input "+LOGIN+" for log In");
    }

    private static void printStudentByLessonName() {
        System.out.println("Please input lesson name");
        LESSON_STORAGE.printLessons();
        String lessonName = SCANNER.nextLine();
        STUDENT_STORAGE.printStudentByLessonName(lessonName);
    }

    private static void changeStudentLessons() {
        System.out.println("Please input student by email");
        STUDENT_STORAGE.printStudents();
        String studentEmail = SCANNER.nextLine();
        try {
            Student student = STUDENT_STORAGE.getStudentByEmail(studentEmail);
            System.out.println("Please input lessons name by ,");
            LESSON_STORAGE.printLessons();
            String lessonsStr = SCANNER.nextLine();
            String[] lessonsName = lessonsStr.split(",");
            Lesson[] lessons = new Lesson[lessonsName.length];
            for (int i = 0; i < lessonsName.length; i++) {
                Lesson lessonByName = LESSON_STORAGE.getLessonByName(lessonsName[i]);
                lessons[i] = lessonByName;
            }
            student.setLessons(lessons);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
            changeStudentLessons();
        }

    }

    private static void addStudent() {
        System.out.println("Please input name,surname,phone,email");
        String studentStr = SCANNER.nextLine();
        String[] studentData = studentStr.split(",");
        try {
            System.out.println("please input lessons name by ,");
            LESSON_STORAGE.printLessons();
            String lessonsStr = SCANNER.nextLine();
            String[] lessonsName = lessonsStr.split(",");
            Lesson[] lessons = new Lesson[lessonsName.length];
            for (int i = 0; i < lessonsName.length; i++) {
                Lesson lessonByName = LESSON_STORAGE.getLessonByName(lessonsName[i]);
                lessons[i] = lessonByName;
            }
            Student student = new Student();
            student.setName(studentData[0]);
            student.setSurname(studentData[1]);
            student.setPhone(studentData[2]);
            student.setEmail(studentData[3]);
            student.setRegisteredDate(new Date());
            student.setLessons(lessons);
            STUDENT_STORAGE.add(student);
            User user = new User();
            user.setName(studentData[0]);
            Random random=new Random();
            String password="";
            for (int i = 0; i <4 ; i++) {
                password+=String.valueOf(random.nextInt(10));
            }
            password=studentData[0]+password;
            user.setPassword(password);
            user.setSurname(studentData[1]);
            user.setUsername(studentData[3]);
            user.setType("user");
            System.out.println(studentData[3]);
            System.out.println(password);
            USER_STORAGE.add(user);

            System.out.println("user is added");
        } catch (Exception e) {
            System.out.println("Invalid data");
            addStudent();
        }
    }

    private static void printUserCommands() {
        System.out.println("please input "+EXIT+" for exit");
        System.out.println("please input "+CHANGE_PASSWORD+"for change password");
        System.out.println("please input "+CHANGE_MY_LESSON+" for change your lesson");
        System.out.println("please input "+PRINT_MY_LESSONS+" for print lessons");
        System.out.println("please input "+CHANGE_MY_DATA+" for change your data");
        System.out.println("please input "+SEND_MESSAGE+"for send message");
        System.out.println("please input "+VIEW_ALL_MESSAGES+" for view all messages");
    }

    private static void addLesson() {
        System.out.println("Please input name,lecturerName,duration,price");
        String lessonStr = SCANNER.nextLine();
        try {
            String[] lessonData = lessonStr.split(",");
            int duration = Integer.parseInt(lessonData[2]);
            double price = Double.parseDouble(lessonData[3]);
            Lesson lesson = new Lesson(lessonData[0], lessonData[1], duration, price);
            LESSON_STORAGE.add(lesson);
            System.out.println("Lesson was successfully added");
        } catch (Exception e) {
            System.out.println("Invalid Data");
            addLesson();
        }
    }

    private static void printEducationCommands() {
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("Please input " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("Please input " + CHANGE_STUDENT_LESSONS + " for CHANGE_STUDENT_LESSONS");
        System.out.println("Please input " + PRINT_STUDENT_BY_LESSON_NAME + " for PRINT_STUDENT_BY_LESSON_NAME");
    }

}