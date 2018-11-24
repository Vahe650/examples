package shild.collections;

import java.util.LinkedList;

public class Maillist {
    public static void main(String[] args) {
        LinkedList<Adress> ml = new LinkedList<Adress>();
        //avelacnel elementner
        ml.add(new Adress("J.W.West", "11 oak Ave",
                "Urbana", "IL", "31801"));
        ml.add(new Adress("J.W.East", "81 poak Avenue",
                "UrbanIsntitut", "ILlegal", "318787801"));
        ml.add(new Adress("st", "1 k nue",
                "Isntitut", "gal", "3"));
        //durs berel cank@
        for (Adress adress : ml) {
            System.out.println(adress + "\n");
        }

    }


    private static class Adress {
        private String name;
        private String street;
        private String city;
        private String state;
        private String code;

        public Adress(String name, String street, String city, String state, String code) {
            this.name = name;
            this.street = street;
            this.city = city;
            this.state = state;
            this.code = code;
        }

        @Override
        public String toString() {
            return "Adress{" +
                    "name='" + name + '\'' +
                    ", street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", code='" + code + '\'' +
                    '}';

        }
    }
}











