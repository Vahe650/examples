package shild.educationCenter;
public interface EducationCommand {

    int EXIT = 0;
    int LOGIN=1;
    int ADD_LESSON = 1;
    int ADD_STUDENT = 2;
    int PRINT_LESSONS = 3;
    int PRINT_STUDENTS = 4;
    int CHANGE_STUDENT_LESSONS = 5;
    int PRINT_STUDENT_BY_LESSON_NAME = 6;
    int CHANGE_PASSWORD=1;
    int CHANGE_MY_LESSON=2;
    int PRINT_MY_LESSONS=3;
    int CHANGE_MY_DATA=4;
    int SEND_MESSAGE=5;
    int VIEW_ALL_MESSAGES=6;
}

