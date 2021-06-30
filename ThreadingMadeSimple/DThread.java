package advancedJava.Lab4Threads;

public class DThread  extends Thread{
    public void run(){
        for (int i = 0; i < 30000000; i++) {
            System.out.println("Daemon thread "+ this.getName());
        }
    }
}
