package advancedJava.Lab4Threads;

import java.util.ArrayList;

public class Mainclass {

    public static void main(String[] args)  {
        ThreadExample threadExample1= new ThreadExample();
        ThreadExample threadExample2= new ThreadExample();
        ThreadExample threadExample3 = new ThreadExample();
        ThreadExample threadExample4 = new ThreadExample();
        ThreadExample threadExample5 = new ThreadExample();
        ThreadExample threadExample6 = new ThreadExample();
        ThreadExample threadExample7 = new ThreadExample();
        ThreadExample threadExample8 = new ThreadExample();

        threadExample2.setPriority(1);
        threadExample1.setPriority(2);
        threadExample1.setPriority(3);
        threadExample1.setPriority(8);
        threadExample1.setPriority(5);
        threadExample1.setPriority(6);
        threadExample1.setPriority(7);
        threadExample1.setPriority(10);

//
//
//
        ArrayList<ThreadExample> threadExamples = new ArrayList<>();
        threadExamples.add(threadExample1);
        threadExamples.add(threadExample2);
        threadExamples.add(threadExample3);
        threadExamples.add(threadExample4);
        threadExamples.add(threadExample5);
        threadExamples.add(threadExample6);
        threadExamples.add(threadExample7);
        threadExamples.add(threadExample8);



        System.out.println(Thread.MIN_PRIORITY);
        for (ThreadExample t:
             threadExamples) {
            t.start();
        }

        //  Daemon thread runs in background they provide services to other threads
        //  all the threads we have discussed so far are called non daemon thhreads

        DThread dThread = new DThread();
        dThread.setDaemon(true);
        dThread.start();
        DThread dThread1 = new DThread();
        dThread.setDaemon(true);
        dThread1.start();

        for (int i = 0; i < 30; i++) {
            System.out.println("hello world "+Thread.currentThread().getName()+  i);
        }

//        System.out.println("main");

    }
}
