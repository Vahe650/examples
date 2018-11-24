package shild.Glux6.fileSystem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Testserial implements Serializable {
    public byte version = 100;
    public byte count = 0;


    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Serialtest st=new Serialtest();
        oos.writeObject(st);
        oos.flush();
        oos.close();
        System.out.println(st.getVersion());

    }
}
