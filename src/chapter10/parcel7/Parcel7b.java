package chapter10.parcel7;

import chapter10.parcel4.Contests;

public class Parcel7b {
    class Mycontents implements Contests{
        private int i=11;
        @Override
        public int value() {
            return i;
        }
    }
    public Contests contests(){
        return new Mycontents();
    }

    public static void main(String[] args) {
        Parcel7b parcel7b=new Parcel7b();
        Contests c=parcel7b.contests();
        System.out.println(c.value());
    }
}
