// import java.lang.*;
// class myThread extends Thread{
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("Child Thread");
//         }
//     }
// }

class myThread implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
                System.out.println("Child Thread");
        }
    }
}

class Assign10a{
    public static void main(String []args){
        myThread r = new myThread();
        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("Main Thread");
        }
    }
}