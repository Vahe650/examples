package chapter10.parcel;
public class Parcel1 {
    class Contest {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class DEstination {
        private String label;

        DEstination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public DEstination to(String s) {
        return new DEstination(s);
    }

    public Contest contest() {
        return new Contest();

    }

    public void ship(String dest) {
        Contest contest = new Contest();
        DEstination dEstination = to(dest);
        System.out.println(dEstination.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 parcel1 = new Parcel1();
        parcel1.ship("TArzan");
        Parcel1 parcel2=new Parcel1();
        Parcel1.Contest v=parcel1.contest();
        Parcel1.DEstination d=parcel1.to("Borneo");


    }
}
