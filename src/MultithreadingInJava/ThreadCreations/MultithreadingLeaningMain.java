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
        /*
        Step 1 : create runnable class and implement run() basically add what thread has to do
        Step 2 : create object of this runnable object and pass it into thread
        Step 3 : create thread and pass in this runnable object and start the tthread
        OR other ways is using lamda fucntions
        Thread thread = new Thread(()->{
        //same code which we were going to write in run() implementations
        });
         */
        RunnableFunction runnableFunction = new RunnableFunction();
        Thread thread = new Thread(runnableFunction);
        thread.start();
        //OR
        Thread thread2 = new Thread(()->{
            System.out.println("Task Done by Thread: "+Thread.currentThread().getName());
        });
        thread2.start();
        System.out.println("Main Thread Done by Thread: "+Thread.currentThread().getName());
        /*
        So here output is , as we created two thread apart from main thread. main thread does not wait for other threads
        Thread Main is :main
        Task Done by Thread: Thread-0
        Task Done by Thread: Thread-1
         */
    }
}
