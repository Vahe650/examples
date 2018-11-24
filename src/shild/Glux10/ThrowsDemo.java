package shild.Glux10;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.print(" throwOne() metodi marnum;");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[]){
        try {
            throwOne();
        }catch (IllegalAccessException e){
            System.out.println("bacarutyun@ brnvac e "+e);
        }
    }
}
