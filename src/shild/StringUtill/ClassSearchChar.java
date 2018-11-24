package shild.StringUtill;

public class ClassSearchChar {
    public static void main(String[] args) {
        String habr = "habrahabr";
        int length = habr.length();
        //kareli 1 imana'h' simvoli masin
        char searchChar = 'h';
        boolean isFound = false;
        for (int i = 0; i < length; i++) {
            if (habr.charAt(i) == searchChar) {
                isFound = true;
                break;
            }
        }
        System.out.println(isFound);
        System.out.println(habr.indexOf(searchChar) != -1);


    }
}
