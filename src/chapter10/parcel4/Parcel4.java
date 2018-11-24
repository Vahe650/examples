package chapter10.parcel4;

public class Parcel4 {
    private class PContests implements Contests {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String wherTo) {
            label = wherTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contests contests() {
        return new PContests();
    }
}

class TestParcel {
    static public void main(String[] args) {
        Parcel4 p4=new Parcel4();
        Contests c=p4.contests();
        Destination d= p4.destination("Tarzan");


    }


}

