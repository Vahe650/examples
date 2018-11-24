package shild.taskManagment;

import shild.taskManagment.model.*;
import shild.taskManagment.model.UserType;
import shild.taskManagment.storage.CommentStorage;
import shild.taskManagment.storage.ProjectStorage;
import shild.taskManagment.storage.TaskStorage;
import shild.taskManagment.exception.UserNotFoundException;
import shild.taskManagment.storage.UserStorage;


import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class TaskManagment implements Commands {
    static final Scanner SCANNER = new Scanner(System.in);
    static final UserStorage USER_STORAGE = new UserStorage();
    static final TaskStorage TASK_STORAGE = new TaskStorage();
    static final ProjectStorage PROJECT_STORAGE = new ProjectStorage();
    static final CommentStorage COMMENT_STORAGE = new CommentStorage();
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static String email = null;
    private static String proName = null;

    public static void main(String[] args) throws Exception {
        PROJECT_STORAGE.upDateProjects();
        USER_STORAGE.upDateUsers();
        COMMENT_STORAGE.upDateComments();
        TASK_STORAGE.upDateTasks();

        User Manager = new User("անուն", "ազգանուն", "vvv", "sss", UserType.MANAGER);
        USER_STORAGE.add(Manager);
        boolean isStart = true;
        while (isStart) {
            printLogCommands();
            int com;
            try {
                com = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                com = -1;
            }
            switch (com) {
                case -1:
                    System.out.println("please input valid command");
                    break;
                case EXIT:
                    isStart = false;
                    break;
                case LOG_IN:
                    login();
                    break;

            }


        }
    }

    private static void login() throws Exception {
        System.out.println("please input eMail and password");
        try {
            String emailAndPassword = SCANNER.nextLine();
            String[] logdata = emailAndPassword.split(",");
            email=logdata[0];
            User user = USER_STORAGE.getUserByEmail(email);
            if (user != null && user.getPassword().equals(logdata[1])) {
                switch (user.getType()) {
                    case USER:
                        userLogin();
                        break;
                    case MANAGER:
                        managerLogin();
                        break;


                }
            }
        } catch (UserNotFoundException e) {
            System.out.println("user is not exisT");
        }
    }

    private static void managerLogin() throws Exception {
        System.out.println("manager");
        boolean isRun = true;
        while (isRun) {
            managerComands();
            int com;
            try {
                com = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                com = -1;
            }
            switch (com) {
                case -1:
                    System.out.println("please input normal command");
                case LOG_OUT:
                    isRun = false;
                    break;
                case ADD_USER:
                    addUser();
                    break;
                case ADD_TASK:
                    addTask();
                    break;
                case PRINT_ALL_TASKS:
                    printAllTasks();
                    break;
                case PRINT_ALL_USERS:
                    printAllUsers();
                    break;
                case PRINT_TASKS_BY_SSTATUS:
                    printTasksByStatus();
                    break;
                case CREATED_NEW_PROJECT:
                    createdNewProject();
                    break;
                case PRINT_ALL_PROJECTS:
                    printProjects();
                    break;
                case ADD_MANAGERCOMMENT:
                    addComment();
                    break;
                case PRINT_ALL_COMMENTS:
                    printAllComments();
                    break;
                default:
                    System.out.println("invalid comand");
            }
        }
    }

    private static void userLogin() throws IOException {
        System.out.println("user");
        boolean isGo = true;
        while (isGo) {
            printUserCommands();
            int com;
            try {
                com = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                com = -1;
            }
            switch (com) {
                case -1:
                    System.out.println("please input normal command");
                case LOG_OUT:
                    isGo = false;
                    break;
                case PRINT_MY_NEW_TASKS:
                    printMyNewTasks();
                    break;
                case PRINT_MY_CURRENT_TASKS:
                    printMyCurrentTasks();
                    break;
                case PRINT_MY_FINISHED_TASKS:
                    printMyFinishedTask();
                    break;
                case CHANGE_MY_TASK_STATUS_BY_NAME:
                    changeMyTaskStatusByName();
                    break;
                case CHANGE_MY_TASK_ESTIMATION_BY_NAME:
                    changeMyTaskEstimationByName();
                    break;
                case ADD_USERCOMMENT:
                    addComment();
                    break;
                case PRINT_USERCOMMENT:
                    printUserComments();
                    break;
                default:
                    System.out.println("invalid com");
                    break;
            }
        }

    }

    private static void printUserComments()throws NullPointerException {
        TASK_STORAGE.printTaskByEmail(email);
        System.out.println("please input task's title");
       try {
           String title = SCANNER.nextLine();
           COMMENT_STORAGE.printCommentsByTask(title);
    }catch (NullPointerException e){
           System.out.println("task is not used");
       }
    }

    private static void printAllComments() {
        COMMENT_STORAGE.printAllComments();
    }

    private static void addComment() throws IOException {
        System.out.println("please input comented userName");
        email = SCANNER.nextLine();
        if (USER_STORAGE.getUserByEmail(email) != null) {
            System.out.println("write task's title");
            String taskTitle = SCANNER.nextLine();
            if (TASK_STORAGE.getTaskByTitle(taskTitle) != null) {
                System.out.println("write your comment");
                String commentData = SCANNER.nextLine();
                Comment comment = new Comment();
                comment.setTask(TASK_STORAGE.getTaskByTitle(taskTitle));
                comment.setCommentedUser(USER_STORAGE.getUserByEmail(email));
                comment.setText(commentData);
                comment.setCommentedDate(new Date());
               COMMENT_STORAGE.addComment(TASK_STORAGE.getTaskByTitle(taskTitle),comment);
                System.out.println("comment is added");
            } else System.out.println("Task with " + taskTitle + " is not exist");


        } else System.out.println("User with " + email + " is not exist");
    }


    private static void printProjects() {
        PROJECT_STORAGE.printAllProjects();
    }

    private static void createdNewProject() throws ParseException {
        System.out.println("please input Project's name,price startDate and endDate");
        System.out.println("Date format is: 12/12/2012");
        try {
            String str = SCANNER.nextLine();

            String[] projectData = str.split(",");
            Project project = new Project();
            project.setName(projectData[0]);
            project.setPrice(Double.parseDouble(projectData[1]));
            project.setStartDate(sdf.parse(projectData[2]));
            project.setEndedDate(sdf.parse(projectData[3]));
            PROJECT_STORAGE.add(project);
            System.out.println("project is added");
        }catch (ParseException e){
            System.out.println("uncorect Date format");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void changeMyTaskEstimationByName() {

        TASK_STORAGE.printTaskByEmail(email);
        System.out.println("please input task's title");
        String title = SCANNER.nextLine();
        System.out.println("please input new estimation");
        long change = Long.parseLong(SCANNER.nextLine());
        TASK_STORAGE.changeTasEstimationkByTitle(change, title);
    }


    private static void changeMyTaskStatusByName() {
        TASK_STORAGE.printTaskByEmail(email);
        System.out.println("input task's title");
        String title = SCANNER.nextLine();
        System.out.println("input task status");
        String status = SCANNER.nextLine();
        TASK_STORAGE.changeMyTaskStatusByTitle(status, title);
    }

    private static void printMyFinishedTask() {
            String status = "FINISHED";
            TASK_STORAGE.printTasksByemailAndStatus(status, email);
            System.out.println("Well done");
    }

    private static void printMyCurrentTasks() {
        String status = "inProgress";
        TASK_STORAGE.printTasksByemailAndStatus(status, email);
    }


    private static void printMyNewTasks() {
        String status = "new";
        TASK_STORAGE.printTasksByemailAndStatus(status, email);
    }

    private static void printTasksByStatus() {
        System.out.println("please input status for print tasks");
        try {
            String status = SCANNER.nextLine();
            TASK_STORAGE.printTaskByStatus(status);

        } catch (NullPointerException e) {
            System.out.println("task's status does not exist");
        }
    }

    private static void printAllUsers() throws IOException, ClassNotFoundException {
        USER_STORAGE.printUsers();
    }

    private static void printAllTasks() {
        TASK_STORAGE.printTasks();
    }

    private static void addTask() throws NullPointerException {
        System.out.println("please input project name");
        try {
            proName = SCANNER.nextLine();
            if (PROJECT_STORAGE.getProjectByName(proName) != null) {
                Task task = new Task();
                task.setProject(PROJECT_STORAGE.getProjectByName(proName));


                System.out.println("please input title,desc,estimate,email,");
                String str = SCANNER.nextLine();
                String[] taskData = str.split(",");


                task.setTitle(taskData[0]);
                task.setDesc(taskData[1]);
                task.setEstimate(Long.parseLong(taskData[2]));
                task.setAssignTo(taskData[3]);

                if (USER_STORAGE.getUserByEmail(taskData[3]) != null) {
                    taskData[3] = email;
                } else {
                    System.out.println("no user");
                    addTask();
                }
                task.setCreatedDate(new Date());
                task.setStatus("NEW");
                TASK_STORAGE.add(task);
                System.out.println("task is added");


            } else System.out.println("invalid project");
        } catch (NullPointerException e) {
            System.out.println("null");
        }
    }
    private static void addUser() throws IOException {
        System.out.println("please input user's name,surname,email,password");
        String str = SCANNER.nextLine();
        String[] logdata = str.split(",");
            User user = new User();
            user.setName(logdata[0]);
            user.setSurname(logdata[1]);
            user.setEmail(logdata[2]);
            user.setPassword(logdata[3]);
            user.setType(UserType.USER);
            USER_STORAGE.add(user);
            System.out.println(user);
            System.out.println("user is added");

    }

    private static void printUserCommands() {
        System.out.println("please input " + LOG_OUT + " for exit");
        System.out.println("please input " + PRINT_MY_NEW_TASKS + " for print my new tasks");
        System.out.println("please input " + PRINT_MY_CURRENT_TASKS + " for print my Current tasks");
        System.out.println("please input " + PRINT_MY_FINISHED_TASKS + " for print my finished tasks");
        System.out.println("please input " + CHANGE_MY_TASK_STATUS_BY_NAME + " for change my tasks status by name");
        System.out.println("please input " + CHANGE_MY_TASK_ESTIMATION_BY_NAME + " for change my tasks estimations by name");
        System.out.println("please input " + ADD_USERCOMMENT + " for add userComments");
        System.out.println("please input " + PRINT_USERCOMMENT + " for print userComments");
    }

    private static void managerComands() {
        System.out.println("please input " + LOG_OUT + " for exit");
        System.out.println("please input " + ADD_USER + " for add user");
        System.out.println("please input " + ADD_TASK + " for add task");
        System.out.println("please input " + PRINT_ALL_TASKS + " for print all tasks");
        System.out.println("please input " + PRINT_ALL_USERS + " for print all users");
        System.out.println("please input " + PRINT_TASKS_BY_SSTATUS + " for print tasks by status");
        System.out.println("please input " + CREATED_NEW_PROJECT + " for created new project");
        System.out.println("please input " + PRINT_ALL_PROJECTS + " for print All projects ");
        System.out.println("please input " + ADD_MANAGERCOMMENT + " for add comment");
        System.out.println("please input " + PRINT_ALL_COMMENTS + " for print all comments");

    }

    public static void printLogCommands() {
        System.out.println("please input " + EXIT + " for exit program");
        System.out.println("Please input " + LOG_IN + " for log IN");
    }


}
