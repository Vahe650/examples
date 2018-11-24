package glux5;

public class SwitchCount {
    public static void main(String[] args) {
        int count;
        count = 1;
        switch (count) {
            case 1:
                int target;
                target = 1;
                switch (target) { // nerdrvac switch operator
                    case 0:
                        System.out.println("target=0");
                        break;
                    case 1: //hakasutyunner chkan artaqin operatori het
                        System.out.println("target=1");
                        break;
                }
                default:
                    System.out.println("esim");
                break;
        }
    }}
