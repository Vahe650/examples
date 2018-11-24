package chapter9.ex19;

import java.util.Random;

public class CEnts implements Game {
    @Override
    public void cubsRolls() {

    }

    @Override
    public void centRolls() {
        Random random=new Random();

        int cents=random.nextInt(2);
        switch (cents){
            case 0:
                System.out.println("ORYOL");
                break;
            case 1:
                System.out.println("RESHKA");
                break;
        }

    }
}
