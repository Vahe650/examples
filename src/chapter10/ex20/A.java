package chapter10.ex20;

public class A {

    U makeU() {

        return new U() {


            @Override
            public void first() {

                System.out.print(" first ");


            }

            @Override
            public void second() {

                System.out.print( " second ");

            }

            @Override
            public void third() {

                System.out.println(" third ");



            }



        };
    }
}
