package MultithreadingInJava.ThreadPool;

import java.util.concurrent.ThreadFactory;

public class customThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
            thread.setName("MyThread");
            thread.setPriority(Thread.NORM_PRIORITY);
            thread.setDaemon(false);
        return thread;
    }
}
