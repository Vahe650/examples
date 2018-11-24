package chapter8.shape;

import java.util.Random;

public class RandomShapeGEnerator {
   private Random random=new Random(47);
   public Shape next(){
       switch (random.nextInt(3)){

           case 0:
               return new Circle();
           case 1:
               return new Square();
           case 2:
               return new Triangle();
               default:
                   return new Shape();
       }
   }
}
