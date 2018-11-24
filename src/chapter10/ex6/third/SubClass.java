package chapter10.ex6.third;

import chapter10.ex6.containsMethod.Contains;
import chapter10.ex6.other.Other;

public class SubClass extends Other{
   public Contains contains(Other o){
       return o.impl();
   }

    public static void main(String[] args) {
        SubClass o=new SubClass();
        o.contains(new Other()).onlyOne();

    }
}
