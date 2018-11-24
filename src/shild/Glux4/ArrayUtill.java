package shild.Glux4;

public class ArrayUtill {
    public void commonElements(int[] firstArray, int[] secondArray) {
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    System.out.print(secondArray[j] + " ");

                }
            }
        }
    }

    public int[] removeDuplicates(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[size - 1];
                    size--;
                    j--;
                }
            }
        }
        if (size == array.length) {
          return array;
        }
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }
        return result;


    }
}










