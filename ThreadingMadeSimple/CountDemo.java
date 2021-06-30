package advancedJava.Lab4Threads;

public class CountDemo {
    public static void main(String[] args) throws InterruptedException {
        CounterExample c = new CounterExample();
        IncrementingThread incrementingThread = new IncrementingThread(c);
        DecrementingThread decrementingThread = new DecrementingThread(c);

        incrementingThread.start();
        decrementingThread.start();

        incrementingThread.join();
        decrementingThread.join();

        c.display();

        //data raise condition

    }
}
