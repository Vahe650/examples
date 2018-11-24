package chapter10.ex6.other;

import chapter10.ex6.containsMethod.Contains;

public class Other {
    private class Impl implements Contains{

        @Override
        public void onlyOne() {
            System.out.println("One and Only");
        }

    }
    public Contains impl(){
        return new Impl();
    }
}
