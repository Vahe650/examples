package shild.Glux4;

public class ArrayUtillTest {
    public static void main(String[] args) {
        ArrayUtill com=new ArrayUtill();
        int []array={54,21,35,35,87,95,30,33};
        int[] array2={21,87,25,55,55,47,54,77};
        com.commonElements(array,array2);
        System.out.println();

        int [] result=com.removeDuplicates(array);
        for (int i : result) {
            System.out.print(i+"  ");
        }
    }
}
