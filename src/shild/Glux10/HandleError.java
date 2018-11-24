package shild.Glux10;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        Random r=new Random();
        for (int i = 0; i <15 ; i++) {
            try {
                b=r.nextInt();
                c=r.nextInt();
                a=12345/(b/c);
            }catch (ArithmeticException exc){
                System.out.println("0-i chi bajanvum");
            }
            System.out.println("a; "+a);
        }
    }
}
