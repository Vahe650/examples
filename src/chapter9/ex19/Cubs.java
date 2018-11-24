package chapter9.ex19;

import java.util.Random;

public class Cubs implements Game {

    @Override
    public void cubsRolls() {
        Random random = new Random();
        for (int i = 1; i <= 2; i++) {
            int i1 = random.nextInt(6);
            switch (i1) {
                case 0:
                    System.out.print(Game.ONE+" ");
                    break;
                case 1:
                    System.out.print(Game.TWO+" ");
                    break;
                case 2:
                    System.out.print(Game.THREE+" ");
                    break;
                case 3:
                    System.out.print(Game.FOUR+" ");
                    break;
                case 4:
                    System.out.print(Game.FIVE+" ");
                    break;
                case 5:
                    System.out.print(Game.SIX+" ");
                    break;
            }
        }

    }

    @Override
    public void centRolls() {
    }
}
