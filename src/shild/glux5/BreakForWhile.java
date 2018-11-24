package glux5;

//whileic durs galu hamar
public class BreakForWhile {
   /* public static void main(String[] args) {
        int i=0;
        while (i<100){
            if (i==10)break;
            System.out.println("i "+i);
            i++;
        }
        System.out.println("cikli avart");
    }
}*/
   public static void main(String[] args) {
      for (int i = 0; i <3 ; i++) {
           System.out.print("proxod " + i + ": ");
           for (int j = 0; j < 100; j++) {
               if (j == 19) break ;
               System.out.print(j + " ");
           }
           System.out.println();
       }
       System.out.println("cikli avart");
   }


}


