package fileExample.serialization;

import java.io.*;


public class SerializationDemo {

    private static final String FILE_PATH = "D:\\Desktop\\createdFiles\\example.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student student = new Student("poxos", "poxosyan", 36, "poxos@gmail.com");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(FILE_PATH));

        objectOutputStream.writeObject(student);




        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(FILE_PATH));
        Object deserialization = objectInputStream.readObject();
        Student st = (Student) deserialization;
        System.out.println(st);

    }

}
