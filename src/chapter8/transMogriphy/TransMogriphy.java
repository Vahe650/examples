package chapter8.transMogriphy;
class Actor{
    public void act(){

    }
}
class HappyActor extends Actor{
    @Override
    public void act() {
        System.out.println("HappyActor");
    }
}
class SadActor extends Actor{
    @Override
    public void act() {
        System.out.println("SadActor");
    }
}
class NormalActor extends Actor{
    @Override
    public void act() {
        System.out.println("NormalActor");
    }
}
class Stage{
    private Actor actor=new HappyActor();
    public void change(){
        actor=new SadActor();
    }
    public void dubleChange(){
        actor=new NormalActor();
    }
    public void performPlay(){
        actor.act();
    }
}

public class TransMogriphy {
    public static void main(String[] args) {
        Stage stage=new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
        stage.dubleChange();
        stage.performPlay();
    }
}
