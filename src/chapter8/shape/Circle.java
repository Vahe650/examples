package chapter8.shape;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erase Circle");
    }
    @Override
    public void reDraw() {
        System.out.println("reDraw Circle");
    }
}
