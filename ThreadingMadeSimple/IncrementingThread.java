package advancedJava.Lab4Threads;

public class IncrementingThread extends Thread {
    CounterExample c;
    IncrementingThread(CounterExample c){
        this.c=c;
    }
    public void run(){

        c.increment();
    }
}
