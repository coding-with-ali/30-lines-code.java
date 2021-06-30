package advancedJava.Lab4Threads;

public class DecrementingThread extends Thread {
    CounterExample c;
    DecrementingThread(CounterExample c){
        this.c=c;
    }
    public void run(){
        c.decrement();
    }
}
