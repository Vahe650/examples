package chapter9.adaptedRandomDoubles;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;
class RandomDoubles{
    public static Random random=new Random(47);
    public double next(){
        return random.nextDouble();
    }

    public static void main(String[] args) {
        RandomDoubles randomDoubles=new RandomDoubles();
        for (int i = 0; i < 7; i++) {
            System.out.println(randomDoubles.next()+" ");
        }
    }
}

public class AdaptedRandomDoubles extends RandomDoubles implements Readable {
    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count--==0)
        return -1;
        String result=Double.toString(next())+" ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(new AdaptedRandomDoubles(7));
        while (scanner.hasNextDouble())
            System.out.println(scanner.nextDouble()+" ");
    }
}
