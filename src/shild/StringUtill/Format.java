package shild.StringUtill;

public class Format {
    public static void main(String[] args) {


        String formatString = "we are printing double variable(%F),string ('%s')and integer variable (%d).";
        System.out.println(String.format(formatString, 2.3, "habr", 10));


    }

}
