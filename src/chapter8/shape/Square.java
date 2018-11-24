package chapter8.shape;

public class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("Draw Square");
    }

    @Override
    public void erase() {
        System.out.println("Erase Square");
    }
    @Override
    public void reDraw() {
        System.out.println("reDraw Square");
    }
}

