package chapter10.parcel11;

import chapter10.parcel4.Contests;
import chapter10.parcel4.Destination;

public class Parcel11 {

    private static class ParcelContets implements Contests{
        private int i=11;

        @Override
        public int value() {
            return i;
        }
    }
    protected static class ParcelDestination implements Destination{
        private String label;
        private ParcelDestination(String whereTo){
            label=whereTo;
        }
        @Override
        public String readLabel() {
            return label;
        }
        public static void f(){
        }
        static int x=10;
        static class AnotherLevel{
            public static void f(){
            }
            static int x=10;
        }
    }
    public static Destination destination(String s){
        return new ParcelDestination(s);
    }
    public static Contests contests(){
        return new ParcelContets();
    }

    public static void main(String[] args) {
        Contests contests=contests();
        Destination destination=destination("Tarzan");
        System.out.println(contests.value());
        System.out.println(destination.readLabel());
    }



}
