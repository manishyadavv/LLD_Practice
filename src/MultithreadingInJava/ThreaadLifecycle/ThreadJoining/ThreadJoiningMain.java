package MultithreadingInJava.ThreaadLifecycle.ThreadJoining;

public class ThreadJoiningMain {

    public static void main(String args[]) throws InterruptedException {
        /*
        So what join means Thread calling will be blocked and wait till current thread completes its specific task
         This is used for certain thread to complete task before moving ahead
        */
        System.out.println("Main thread started: "+ Thread.currentThread().getName());
        Thread thread1 = new Thread(()->{
           try{
               Thread.sleep(10000);
           } catch (Exception e){
               // do something
           }
        });

        thread1.start();
        thread1.join();
        System.out.println("Main thread ended: "+ Thread.currentThread().getName());
    }
}
