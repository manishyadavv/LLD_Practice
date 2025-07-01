package MultithreadingInJava.LocksAndConditions.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMain {
    public static void main(String args[]){
        /*
            CHECK
            README.md
         */

        ReentrantLock lock = new ReentrantLock();

        SharedResource2 resource = new SharedResource2();

        Thread thread1 = new Thread(()->{
                resource.produce(lock);
        });

        SharedResource2 resource2 = new SharedResource2();

        Thread thread2 = new Thread(()->{

                resource2.produce(lock);

        });

        thread1.start();
        thread2.start();
    }
}
