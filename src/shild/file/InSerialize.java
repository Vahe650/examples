package shild.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class InSerialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\User\\IdeaProjects\\untitled\\src\\files/txt"));
        Date d1=(Date)in.readObject();
        RandomClass r1=(RandomClass)in.readObject();
        RandomClass r2=(RandomClass)in.readObject();
        System.out.println("i have read");
        System.out.println("A date object  "+d1);
        System.out.println("two groups randoms");


    }
}
