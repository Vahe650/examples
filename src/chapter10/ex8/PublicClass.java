package chapter10.ex8;

public class PublicClass {
    private class PrivateClass implements PublicInterface {

        public PublicInterface returnPrivateObject() {
            PublicInterface pi = new PrivateClass();
            return pi;
        }
    }
    public static void main(String[] args) {
        PrivateClass p=(new PublicClass()).new PrivateClass();
        p.returnPrivateObject();
//        chi stacvi,classy private e
//        PublicClass pi= ((PublicInterface) (new PublicClass()).new PrivateClass());

    }
}
