package chapter10.multiInterfaces;

 interface A {}
 interface B {}
 class X implements A,B{}
 class Y implements A{
     B makeB(){
         //anonimniy nested class
         return new B() {};
     }
 }
 public class MultiINterfaces{
     static void takesA(A a){}
     static void takesB(B b){}

     public static void main(String[] args) {
         X x=new X();
         Y y=new Y();
         takesA(x);
         takesA(y);
         takesB(x);
         takesB(y.makeB());
     }

 }

