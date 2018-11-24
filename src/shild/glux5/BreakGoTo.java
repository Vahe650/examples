package glux5;

public class BreakGoTo {
    public static void main(String[] args) {
      /*  boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Пpeдшecтвyeт оператору break");
                    if (t) break second;//second blokic durs
                }
                System.out.println("Этoт оператор не будет выполняться");
            }
            System.out.println("Этoт оператор следует за блоком second");
        }---------------------------------*/
        //break nerdrvac ciklic durs galu hamar
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("proxod " + i + ": ");

            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer;//2 ciklic durs gal
                System.out.print(j + " ");
            }
            System.out.println("ays tox@ chka");
        }
        System.out.println("cikli avart");
    }
}