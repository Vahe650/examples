package chapter8.polymorpfConstructors;
class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    public Glyph() {
        System.out.println("Glyph() pered vizovom draw()");
        draw();
        System.out.println("Glyph() posle vizova draw()");
    }
}
    class RouondGlyph extends Glyph{
        private int radius=1;
        public RouondGlyph(int radius) {
            this.radius = radius;
            System.out.println("RouondGlyph.RouondGlyph(), radius= "+radius);
        }

        @Override
        void draw() {
            System.out.println("RouondGlyph.draw(), radius= "+radius);
        }
    }

public class PolymorphConstructors {
    public static void main(String[] args) {
        new RouondGlyph(5);
    }

}
