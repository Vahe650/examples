package chapter9.ex19;

public class Nardi implements GameFActory {
    @Override
    public Game getGameMethods() {
        return new Cubs(){
            @Override
            public void cubsRolls() {
                super.cubsRolls();
            }
        };
    }

    public static void main(String[] args) {
        FAct.customer(new Nardi());
        Nardi nardi=new Nardi();
        System.out.println();
        nardi.getGameMethods().cubsRolls();
        System.out.println();
        nardi.getGameMethods().cubsRolls();
    }
}
