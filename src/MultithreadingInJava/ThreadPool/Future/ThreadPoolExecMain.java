package MultithreadingInJava.ThreadPool.Future;

import java.util.concurrent.*;

public class ThreadPoolExecMain {
    public static void main(String args[]) throws ExecutionException, InterruptedException {


        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor( 1, 1, 1, TimeUnit.HOURS,
                    new ArrayBlockingQueue<>(4),
                    new customThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy()
                );

        Future<?> result = threadPoolExecutor.submit(()->{
            System.out.println(" Task executed");

        });
        Future<Integer> result2 = threadPoolExecutor.submit(()->{
            System.out.println("ffd");
            return 20;
        });
        Object object = result.get();// waits until tak is completed and then we printing result, and storing in Object as its the Parent of all
        System.out.println(" Task done?:"+ result.isDone());

        threadPoolExecutor.shutdown();

    }



}
