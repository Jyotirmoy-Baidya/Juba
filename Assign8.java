import p1.A;
import p1.B;
import p2.C;

class Assign8{
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        a.A1(); //Public
        b.b1(); //Default
        c.c1(); //Protected
        a.m1(); //Public
    }
}