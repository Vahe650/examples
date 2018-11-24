package shild.educationCenter.storage;
import shild.educationCenter.model.Lesson;

public class LessonStorage {

    private Lesson[] lessons = new Lesson[16];
    private int size = 0;

    public void add(Lesson lesson) {
        if (size == lessons.length) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
        lessons = tmp;
    }

    public void printLessons() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);
        }
    }

    public Lesson getLessonByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)) {
                return lessons[i];
            }
        }
        return null;
    }


}