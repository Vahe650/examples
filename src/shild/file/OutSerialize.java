package shild.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class OutSerialize {
    public static void main(String[] args) throws IOException{
        RandomClass r1=new RandomClass();
        RandomClass r2=new RandomClass();
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:\\Users\\User\\IdeaProjects\\untitled\\src\\files/txt"));
        Date now=new Date(System.currentTimeMillis());
        out.writeObject(now);
        out.writeObject(r1);
        out.writeObject(r2);
        out.close();
        System.out.println("i have written: ");
        System.out.println("A date object "+now);
        System.out.println("two group of Randoms");
        r1.printOut();
        r2.printOut();

    }
}
