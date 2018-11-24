package chapter10.parcel3;

public class Parcel3 {
     class Contest{
        private int i=11;
        public int value(){
            return i;
        }
    }
    class Destination{
        private String label;

        public Destination(String whereTo) {
            label=whereTo;
        }
        String readLabel(){
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 parcel3=new Parcel3();
        Parcel3.Contest c =parcel3.new Contest();
        Parcel3.Destination pd= parcel3.new Destination("Tarzan");








    }
}
