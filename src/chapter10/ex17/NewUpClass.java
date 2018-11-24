package chapter10.ex17;

public class NewUpClass {
   static class  FirstInner{
      static   class SecondInner{

        }
    }

    public static void main(String[] args) {
//        FirstInner fi=new NewUpClass().new FirstInner();
//        FirstInner.SecondInner si=fi.new SecondInner();
        FirstInner fi=new FirstInner();
        FirstInner.SecondInner si=new FirstInner.SecondInner();

    }
}
