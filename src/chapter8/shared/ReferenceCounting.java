package chapter8.shared;

class Shared {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("sozdayom " + this);
    }

    public void addRef() {
        refCount++;
    }

    protected void dispose() {
        if (--refCount == 0) {
            System.out.println("disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared{} " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("sozdayom " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing{" + id +
                '}';
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composings = {new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)};
        for (Composing composing : composings) {
            composing.dispose();
        }
    }
}
