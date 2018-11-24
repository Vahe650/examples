package chapter9.ex19;

class FAct {
    static void customer(GameFActory fact) {
        Game game = fact.getGameMethods();
        game.centRolls();
        game.cubsRolls();
    }


}
