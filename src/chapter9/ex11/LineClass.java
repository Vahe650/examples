package chapter9.ex11;

import java.util.Arrays;

public class LineClass {
   public ClassAnonym classAnonym(){
       return new ClassAnonym(){
           @Override
           public String changeCharacters( final String string) {
               return super.changeCharacters(string);
           }
       };
   }
    public static void main(String[] args) {
        LineClass lineClass = new LineClass();
        lineClass.classAnonym().changeCharacters("abcdefghijklmnopqrstuvwxyz34");
    }
}
