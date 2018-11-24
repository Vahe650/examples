package shild.Glux10;

public class CathesDemo {
    public static void main(String[] args) {
        try {
            int a=args.length;
            System.out.println("a= "+a);
            int b=42/a;
            int c[]={1,2};
            System.out.println(c[42]);
            System.out.println("a= "+a);
        }catch (ArithmeticException exc){
            System.out.println("0-i chi bajanvum"+exc);
        }catch (ArrayIndexOutOfBoundsException arr){
            System.out.println("massivic durs es trel"+arr);
        }
        System.out.println("verjnakan");
    }
}
