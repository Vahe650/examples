package shild.StringUtill;

public class StringExample {
    public static void main(String[] args) {
        String str = " simonyanvahe ";
        char[] symbols = str.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            System.out.print(symbols[i]);
        }
        System.out.println();

        String newstr = new String(symbols);
        {//simvolneri qanak@
            for (char x : symbols) {
            }
            int count = 0;
            count += str.length();
            System.out.print(count);
        }
        System.out.println();
        {
            String resut = str.substring(6, 8);//mejtexi tarer@
            System.out.println(resut);
        }
        System.out.println();
        boolean result = str.endsWith("he ");//endswith
        System.out.println(result);
    }







    }

