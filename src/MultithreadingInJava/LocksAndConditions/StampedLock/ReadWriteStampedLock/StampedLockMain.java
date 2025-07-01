package MultithreadingInJava.LocksAndConditions.StampedLock.ReadWriteStampedLock;

import java.util.concurrent.locks.StampedLock;

public class StampedLockMain {
    public static void main(String args[]){
        /*
            CHECK
            README.md
            It's a unique lock that provides both type of locking mechanism

         */

        //Two read threads
        StampedLock lock = new StampedLock();
        /*
        1st approach using read/ write way of creating the stamped lock
        it has long timestamp returned which is used to unlock later
         */

        SharedResource sharedResource = new SharedResource();
        Thread thread1 = new Thread(()->{
            sharedResource.read(lock);
        });

        Thread thread2 = new Thread(()->{
            sharedResource.read(lock);

        });
        SharedResource sharedResourceObj = new SharedResource();
        Thread thread3 = new Thread(()->{

            sharedResourceObj.write(lock);
        });
        thread1.start();
        thread2.start();
        thread3.start();


    }
}
