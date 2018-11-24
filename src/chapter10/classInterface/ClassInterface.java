package chapter10.classInterface;

public interface ClassInterface {
    void howdy();
    class Test implements ClassInterface{

        @Override
        public void howdy() {
            System.out.println("hello World");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }

}
