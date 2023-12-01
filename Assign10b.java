class myThread1 extends Thread{
    int n;
    myThread1(int n){
        this.n=n;
    }
    public void run(){
        int f=1;
        try{
            for(int i=1;i<=n;i++){
                Thread.sleep(1000);
                f=f*i;
                System.out.println(f);
            }
        }
        catch(InterruptedException e){
            System.out.println("Mojulika handled");
        }
    }
}

class myThread2 extends Thread{
    public void run(){
        System.out.println("T2");
    }
}

class Assign10b{
    public static void main(String []args){
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}