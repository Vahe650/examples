package glux5;

//erkchap massiv ev foreach
public class ForEachArray {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];
        //veragrel nums massivi elementnerin arjeq
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);
        //ogtagorcel Foreach gumar@ hashvelu hamar
        for (int[] x : nums) {
            for (int y : x) {
                System.out.println("havasar e " + y);
                sum+=y;
            }
        }
        System.out.println("gumar " +sum);
    }

}
