package MultithreadingInJava.ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecMain {
    public static void main(String args[]){


        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor( 2, 4, 1, TimeUnit.MINUTES,
                    new ArrayBlockingQueue<>(4),
                    new customThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy()
                );

        for(int i=0;i<4;i++){
            Runnable task = () -> System.out.println("New Task");
            threadPoolExecutor.submit(task);
            /*
            OR
            threadPoolExecutor.submit(()->{
            System.out.println("New Task");
            });
             */
        }

        threadPoolExecutor.shutdown();

    }



}
