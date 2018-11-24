package shild.StringUtill;

import java.nio.charset.Charset;

public class StringString {
    public static void main(String[] args) {
        String habr = "habrahabr";
        char[] habrAsArrayOfChars = {'h', 'a', 'b', 'r', 'a', 'h', 'a', 'b', 'r'};
            byte[] habrAsArrayOfBytes = {104, 97, 98, 114, 97, 104, 97, 98, 114};
        String first = new String();
        String second = new String(habr);
        String third=new String(habrAsArrayOfChars);//habrahabr
        String fourth=new String(habrAsArrayOfChars,0,4);//habr
        String fifth=new String(habrAsArrayOfBytes, Charset.forName("UTF-16BE"));//kwdavwrumy anpetq e
        String sixth=new String(new StringBuffer(habr));
        String seventh=new String(new StringBuilder(habr));


    }
}
