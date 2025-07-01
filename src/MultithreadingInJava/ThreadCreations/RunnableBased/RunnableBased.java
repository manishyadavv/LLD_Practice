package MultithreadingInJava.ThreadCreations.RunnableBased;

public class RunnableBased implements Runnable{
    @Override
    public void run() {
        System.out.println("Task Done by Thread: "+Thread.currentThread().getName());
    }
}
