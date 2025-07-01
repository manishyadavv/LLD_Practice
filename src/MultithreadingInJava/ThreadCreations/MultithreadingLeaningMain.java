package MultithreadingInJava.ThreadCreations;

public class MultithreadingLeaningMain {
    public static void main(String args[]){

        // Thread and process
        /*
            from main its called Process and thread is the smallest
            lightweight process
            or Thread is the set of instructions that are executed by the CPU independently
            In process it can have many threads, the one thread created at start of process is called Main thread
        * */
        System.out.println("Thread Main is :"+Thread.currentThread().getName());

        RunnableFunction runnableFunction = new RunnableFunction();
        Thread thread = new Thread(runnableFunction);
        thread.start();
    }
}
