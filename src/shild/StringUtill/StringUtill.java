package shild.StringUtill;

public class StringUtill {
    public String trim(String str) {

        char[] arr = str.toCharArray();
        char[] nor = new char[arr.length];
        int firstPosition = 0;
        int lastPosition = arr.length - 1;
        int i = 0;
        int j = arr.length - 1;
        while (arr[i] != ' ') {
            firstPosition++;
            i++;
        }
        while (arr[j] != ' ') {
            lastPosition--;
            j--;
        }
        String x = str.substring(0, firstPosition);
        String y = str.substring(firstPosition + 1, lastPosition);
        String z = str.substring(lastPosition + 1, arr.length);
        String result = x + y + z;
        return result;
    }



    public int getCountBySymbol(String text, char symbol) {
        for (int i = 0; i < text.length(); i++) {
            int res = text.length();
            res=0;
            return res;
        }
        return 0;
    }

    public void getCountBySymbol(String str) {

    }
}

