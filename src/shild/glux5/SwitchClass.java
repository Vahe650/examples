package glux5;

public class SwitchClass {
    public static void main(String[] args) {
       for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i=0");
                    break;
                case 1:
                    System.out.println("i=1");
                    break;
                case 2:
                    System.out.println("i=2");
                    break;
                case 3:
                    System.out.println("i=3");
                    break;
                case 4:
                default:
                    System.out.println("i>3");

            }

        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "dzmer";
                break;
            case 3:
            case 4:
            case 5:
                season = "garun";
                break;
            case 6:
            case 7:
            case 8:
                season = "amar";
                break;
            case 9:
            case 10:
            case 11:
                season = "ashun";
                break;
            default:
                season = "nor tari";
        }
                System.out.println(season);

    }
}