package shild.file;

import java.io.Serializable;

public class RandomClass implements Serializable {
    private static int r() {
        return (int) (Math.random() * 10);

    }

    private int datafile[];
    public RandomClass(){
        datafile=new int[r()];
        for (int i = 0; i <datafile.length ; i++) {
            datafile[i]=r();
        }

    }
    public void printOut(){
        System.out.println("this randomclass has: "+datafile.length+" random integers   ");
        for (int i = 0; i <datafile.length ; i++) {
            System.out.print(datafile[i]);
            System.out.println();

        }
    }
    }