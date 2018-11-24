package chapter10.parcel10;

import chapter10.parcel4.Destination;

public class Parcel10 {
    public Destination destination(final String dest ,final float price){
        return new Destination() {
            private int costant;{
                costant=Math.round(price);
                if (costant>100)
                    System.out.println("Previshenie Byudjeta");
            }
            private String label=dest;
            @Override
            public String readLabel() {
                return label;
            }

        };

    }

    public static void main(String[] args) {
        Parcel10 p10=new Parcel10();
        Destination destination=p10.destination("Tarzan",102.395F);

    }
}
