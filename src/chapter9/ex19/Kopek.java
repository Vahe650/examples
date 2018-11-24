package chapter9.ex19;

import javax.print.attribute.standard.MediaSize;

public class Kopek implements GameFActory {
    @Override
    public Game getGameMethods() {
        return new CEnts(){
            @Override
            public void centRolls() {
                super.centRolls();
            }
        };
    }
    public static void main(String[] args) {
        FAct.customer(new Kopek());
        Kopek kopek=new Kopek();
        kopek.getGameMethods().centRolls();
    }
}
