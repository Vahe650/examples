package chapter10.ex19;

public interface NestedClassInterface {
    void f();

    void m();

    class NumberOne {
        static NestedClassInterface fm() {
          return   new NestedClassInterface() {
                @Override
                public void f() {
                    System.out.println("f");

                }

                @Override
                public void m() {
                    System.out.println("m");

                }
            };
        }
    }
}
    class Implementation implements NestedClassInterface{

        @Override
        public void f() {
            NestedClassInterface n=NumberOne.fm();
            n.f();


        }

        @Override
        public void m() {
            NestedClassInterface n=NumberOne.fm();
            n.m();

        }

        public static void main(String[] args) {
            Implementation i=new Implementation();
            i.f();
            i.m();
        }
    }

