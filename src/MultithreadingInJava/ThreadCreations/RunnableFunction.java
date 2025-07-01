package MultithreadingInJava.ThreadCreations;

public class RunnableFunction implements Runnable{
    @Override
    public void run() {
        System.out.println("Task Done by Thread: "+Thread.currentThread().getName());
    }
}
