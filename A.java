package p1;
public class A{
    public void m1(){
        System.out.println("M1 method public of class A");
    }
    protected void m2(){
        System.out.println("M2 method protected of class A");
    }
    void m3(){
        System.out.println("M3 method default of class A");
    }
    private void m4(){
        System.out.println("M4 method private of class A");
    }
    public void A1(){
        System.out.println("A1 method public of class A");
        m4();
    }
}