class myThread1 extends Thread{
    public void run(){
        System.out.println("T1");
    }
}

class myThread2 extends Thread{
    public void run(){
        Thread t = Thread.currentThread();
        t.setName("Rishan");
        System.out.println("T2 Thread Priority: " + t.getPriority());
        System.out.println("T2 Thread Name: " + t.getName());
        System.out.println("T2");
    }
}

class Assign10c{
    public static void main(String []args){
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.setPriority(10);
        t2.setPriority(3);
        System.out.println("T1 Thread Priority: " + t1.getPriority());
        System.out.println("T1 Thread Name: " + t1.getName());
        Thread main_thread_object = Thread.currentThread();
        System.out.println("Main Thread Priority: " + main_thread_object.getPriority());
        System.out.println("Main Thread Name: " + main_thread_object.getName());
        t1.start();
        t2.start();
    }
}