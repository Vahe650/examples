package chapter10.parce9;

import chapter10.parcel4.Destination;

public class Parcel9 {
    public Destination destination(final String dest){
        return new Destination() {
            private String label=dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p=new Parcel9();
        Destination d = p.destination("Taerzan");
        System.out.println(d.readLabel());
        Destination o = p.destination("asdasd");
        System.out.println(o.readLabel());
    }
}
