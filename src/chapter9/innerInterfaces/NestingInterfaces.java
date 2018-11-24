package chapter9.innerInterfaces;

public class NestingInterfaces {
    public class BImp implements A.B {

        @Override
        public void f() {

        }
    }

    class CImp implements A.C {

        @Override
        public void f() {

        }
    }

    //    chi kareli irakanacnel private interface
//    baci en klassic vori mej vor vor inqy gtnvum e
//    class DImp implements A.D{
//        @Override
//        public void f() {
//
//        }
//    }
    class EImp implements E {
        @Override
        public void g() {
        }
    }
    class EGImp implements E.G{
        @Override
        public void f() {
        }
    }
    class EImp2 implements E{
        @Override
        public void g() {

        }
    }
    class EG implements E.G{
        @Override
        public void f() {
        }
    }

    public static void main(String[] args) {
        A a=new A();
        //hasaneli che A.D;
        //!A.D=a.getD();
        //voch mi ban chi veradarcnum baci A.D
        //!A.DImp2 dImp2=a.getD();
        //hnaravor che stanal hasaneliutyun
        //interfacei andamin
        //!a.getD().f();
        //miayn urish class A karox e ogtagorcel getD();\
        A a2=new A();
        a2.receiveD(a.getD());
    }
}
