package chapter10.parcel7;

import chapter10.parcel4.Contests;

public class Parcel7 {
    public Contests contests(){
        return new Contests() {
            private int i=11;
            @Override
            public int value() {
                return i;
            }
        };//partadir e ket storakety
    }

    public static void main(String[] args) {
        Parcel7 parcel7=new Parcel7();
        Contests c= parcel7.contests();
        System.out.println(c.value());
    }
}
