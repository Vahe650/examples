package shild.educationCenter.storage;

import shild.educationCenter.model.Lesson;
import shild.educationCenter.model.Student;
import shild.educationCenter.model.StudentNotFoundException;

import java.util.Arrays;

public class StudentStorage {

    private Student[] students = new Student[16];
    private int size = 0;

    public void add(Student student) {
        if (size == students.length) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, students.length);
        students = tmp;
    }

    public void printStudents() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public Student getStudentByEmail(String email) throws StudentNotFoundException {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equalsIgnoreCase(email)) {
                return students[i];
            }
        }
        throw new StudentNotFoundException("Student with " + email + " not exist");
    }

    public void printStudentByLessonName(String lessonName) {
        for (int i = 0; i < size; i++) {
            for (Lesson lesson : students[i].getLessons()) {
                if (lessonName.equalsIgnoreCase(lesson.getName())) {
                    System.out.println(students[i]);
                    break;
                }
            }
        }
    }


    public void printMyLessons(String username) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equalsIgnoreCase(username)) {
                if (students[i].getLessons() != null) {
                    for (int j = 0; j < students[i].getLessons().length; j++) {
                        System.out.println(students[i].getLessons()[j].getName());

                    }

                } else {
                    System.out.println("You don't have lessons yet");
                }
            }


        }
    }

    public Student changeLesson(String lessonName,String newLessonName) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < students[i].getLessons().length; j++) {
                if (students[i].getLessons()[j].getName().equalsIgnoreCase(lessonName)) {
                  students[i].getLessons()[j].setName(newLessonName);

                }


            }


        }return null;
    }

    public Student changePhoneNumber(String old,String newNumber) {
        for (int i = 0; i < size; i++) {
            if (students[i].getPhone().equalsIgnoreCase(old)){
                students[i].setPhone(newNumber);
            }
        }return null;

    }

    public void printAllStudentsName() {
        for (int i = 0; i < size; i++) {
            System.out.print(students[i].getName()+" ");
            System.out.print(students[i].getEmail()+", ");
        }
    }


}