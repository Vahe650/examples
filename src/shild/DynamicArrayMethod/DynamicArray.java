package shild.DynamicArrayMethod;

public class DynamicArray {

    private int[] array = new int[16];

    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }

    public int getByIndex(int index) {
        return array[index];
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void deleteByIndex(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;


    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
