package advancedJava.Lab4Threads;
public class ThreadExample extends Thread{
    public void run(){
        System.out.println("hello world");
        for (int i = 0; i < 30; i++) {
            System.out.println("hello from "+Thread.currentThread().getName()+" ------- "+i);
        }
    }
}
