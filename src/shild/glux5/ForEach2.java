package glux5;

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //break-i gorcacum@ Foreachi mej
        for (int x : nums) {
            System.out.println("havsar e " + x);
            sum += x;
            if (x == 5) break;//dadarecnel cikl2 5ic heto
        }


            System.out.println("elementi gumar@ = e " + sum);

        }
    }