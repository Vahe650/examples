package shild.Glux6.fileSystem;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("temp.out");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Testserial ts=new Testserial();
        System.out.println("version= "+ts.version);
    }
}
