package shild.Glux4;

public class ArraySorting {
    public void sortFromMin(int[] array){
        for (int i = 0; i <array.length ; i++) {
            for (int j = 1; j <array.length ; j++) {
                if(array[j]<array[j-1]){
                    int tmp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=tmp;
                }

            }

        }
    }
    public void sortFromMax(int[]array){
        for (int i = 0; i <array.length ; i++) {
            for (int j = 1; j <array.length ; j++) {
                if(array[j]>array[j-1]){
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }

            }

        }
    }






public void print(int[] array){
    for (int i = 0; i <array.length ; i++) {
        System.out.print(array[i] + " ");
    }
    System.out.println();
    }
}