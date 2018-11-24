package shild.Glux10;

 class NestTyy {
     static void nestTry(int a) {
            try {
                //ete hramani toxum nshvac e 1 argument
                //ayd depqum 0-i bajanman bacarutyum@
                //              kgorcarkvi ays kodum
                if (a==1) a=a/(a-a);//0-i bajanum
                //ete 2 argument e nshvac ays depqum
                //kgorcarkvi massivi sahmanic durs galu
                //bacarutryun@
                if(a==2){
                    int c[]={1};
                    c[42]=99;// aystex kgorcarkvi massivi sahmanic durs
                    //galu bacarutyun@
                }

            }catch (ArrayIndexOutOfBoundsException arr){
                System.out.println("index@ massivi sahmanic durs e");
            }
    }

     public static void main(String[] args) {
         try {
             int a=args.length;
             int b=42/a;
             System.out.println("a= ;"+a);
             nestTry(a);
         }catch (ArithmeticException e){
             System.out.println("0-i bajanum"+e);
         }

     }
}

