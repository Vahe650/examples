package glux5;
//ciklic durs galu hamar
public class Break {
    public static void main(String[] args) {
        for (int i = 1; i <100 ; i++) {
            if (i==10) break;//ciklic durs e galis paymani depqum
            System.out.println("i: "+i);
        }
        System.out.println("cikli avart");
    }
}
