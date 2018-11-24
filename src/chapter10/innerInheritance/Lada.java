package chapter10.innerInheritance;

 class Auto {
     protected String go;

     public Auto(String go) {
         this.go = go;
     }

     public class Door {
        private double height;

        public Door(double height) {
            this.height = height;
        }
    }
}

public class Lada extends Auto {

    public Lada(String go) {
        super(go);
    }

    @Override
    public String toString() {
        return "go";
    }

    class LadaDoor extends Auto.Door{
        double height;

        public LadaDoor(double height) {
            super(height);
            this.height=height;

        }

        @Override
        public String toString() {
            return String.valueOf(height);
        }
    }

    public static void main(String[] args) {
        Lada lada=new Lada("go");
        LadaDoor ladaDoor=lada.new LadaDoor(1.2);
        System.out.println(lada);
        System.out.println(ladaDoor);
    }
}