package p1;
public class B{
    public void b1(){
        System.out.println("B1 Method class B");
        A a = new A();
        //a.m4(); // It is private
        a.m3();
    }
}