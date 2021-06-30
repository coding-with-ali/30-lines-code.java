package advancedJava.Lab4Threads;
public class CounterExample {
    private int  count =0;
// we can sync one method or a  block of the code . it will be easy to sync the code block instead of the whole mehtod
    // example of the sync function.
//    synchronized public void increment () {


     public void increment () {
         synchronized (this) {
         for ( int i = 0; i < 10000; i++ ) {
             count++;
         }
     }
    }

     public void decrement(){
        for (int i = 0; i < 10000; i++) {
            synchronized (this) {
                count--;
            }
        }
    }
    public void display(){
        System.out.println("the count is "+ count);
    }

    // in order to sync the block of the code it will need  to have the refercenc eof the curreent object.

//     public void decrement(){
//    synchronized (this)

//    {
//        for (int i = 0; i < 10000; i++) {
//            count--;
//    }
//        }
//    }
}
