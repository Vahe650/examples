package shild.taskManagment;

public interface Commands {
    int LOG_OUT = 0;
    int EXIT=0;
    int LOG_IN=1;
    int ADD_USER = 1;
    int ADD_TASK = 2;
    int PRINT_ALL_TASKS = 3;
    int PRINT_ALL_USERS = 4;
    int PRINT_TASKS_BY_SSTATUS = 5;
    int CREATED_NEW_PROJECT=6;
    int PRINT_ALL_PROJECTS=7;
    int ADD_MANAGERCOMMENT=8;
    int PRINT_ALL_COMMENTS=9;
    int PRINT_MY_NEW_TASKS=1;
    int PRINT_MY_CURRENT_TASKS=2;
    int PRINT_MY_FINISHED_TASKS=3;
    int CHANGE_MY_TASK_STATUS_BY_NAME=4;
    int CHANGE_MY_TASK_ESTIMATION_BY_NAME=5;
    int ADD_USERCOMMENT=6;
    int PRINT_USERCOMMENT=7;

}
