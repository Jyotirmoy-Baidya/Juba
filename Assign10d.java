// synchronized methods
class Display{
    public synchronized void m1(String a){
        try{
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println(a);
            }
        }   
        catch(InterruptedException e){}
    }
    public synchronized void m2(String a){
        try{
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println("m2 "+ a);
            }
        }   
        catch(InterruptedException e){}
    }
}

class myThread extends Thread{
    Display d;
    String s;
    myThread(Display d, String s){
        this.d=d;
        this.s=s;
    }
    public void run(){
            d.m1(s);

    }
}

class myThread2 extends Thread{
    Display d;
    String s;
    myThread2(Display d, String s){
        this.d=d;
        this.s=s;
    }
    public void run(){
            d.m2(s);
    }
}

public class Assign10d{
    public static void main(String[] args) {
        Display d = new Display();
        myThread t1 = new myThread(d,"Jyoti");
        myThread t2 = new myThread(d,"Bhaluu");
        myThread2 t3 = new myThread2(d,"Aluu");
        t1.start();
        t2.start();
        t3.start();
    }
}