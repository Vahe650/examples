package chapter8.shape;

public class Shapes {
    private static  RandomShapeGEnerator randomShapeGEnerator=new RandomShapeGEnerator();

    public static void main(String[] args) {
        Shape[] shapes=new Shape[35];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = randomShapeGEnerator.next();
        }
            for (Shape shp : shapes) {
                shp.reDraw();
            }
    }
}
