package shild.Glux6.fileSystem;

import java.io.Serializable;

public class Serialtest extends Parent implements Serializable {
    int version=66;
    Contain con=new Contain();
    public int getVersion(){
        return version;
    }

}
