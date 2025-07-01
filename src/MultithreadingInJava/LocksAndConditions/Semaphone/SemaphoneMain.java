package MultithreadingInJava.LocksAndConditions.Semaphone;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class SemaphoneMain {
    public static void main(String args[]){
        /*
            CHECK
            README.md
         */

        Semaphore lock = new Semaphore(2);

        SharedResource resource = new SharedResource();

        Thread thread1 = new Thread(()->{
                resource.produce(lock);
        });

        SharedResource resource2 = new SharedResource();

        Thread thread2 = new Thread(()->{

                resource2.produce(lock);

        });

        thread1.start();
        thread2.start();
    }
}
