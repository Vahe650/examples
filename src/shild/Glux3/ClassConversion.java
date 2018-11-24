package shild.Glux3;
// popoxakani poxakerpum
public class ClassConversion {
    public static void main(String[] args) {
        byte b;
        int i=257;
        double d=323.142;
        System.out.println("\n int tipi poxakerpum byte tip:");
        b=(byte) i;
        System.out.println("i ev b "+i+" "+b);
        System.out.println("\n double tipi poxakerpum int tip:");
        i=(int) d;
        System.out.println("d ev d "+d+" "+i);
        System.out.println("\n double tipi poxakerpum byte tip:");
        b=(byte) d;
        System.out.println("d ev d "+d+" "+b);
    }
}
