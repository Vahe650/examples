package chapter8.shape;

public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erase Triangle");
    }
    @Override
    public void reDraw() {
        System.out.println("reDraw Triangle");
    }
}
