package shild.Glux10;

public class Excep {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
            System.out.println("sa chi ereva");
        } catch (ArithmeticException ex) {//brnel sxal@
            System.out.println("0-i baajanel chi kareli");
        }
        System.out.println("catchic heto ktpvi sa");
    }

}
