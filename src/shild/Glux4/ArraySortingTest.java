package shild.Glux4;

public class ArraySortingTest {
    public static void main(String[] args) {
        ArraySorting sorting=new ArraySorting();
        int[]array={5,2,3,9,7,8,1,6,4};
        sorting.print(array);
        sorting.sortFromMin(array);
        sorting.print(array);
        sorting.sortFromMax(array);
        sorting.print(array);
    }
}
