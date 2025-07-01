package MultithreadingInJava.LocksAndConditions.ReadWrite;

import MultithreadingInJava.LocksAndConditions.ReentrantLock.SharedResource2;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockMain {
    public static void main(String args[]){
        /*
            CHECK
            README.md
         */

        //Two read threads
        ReadWriteLock lock = new ReentrantReadWriteLock();

        SharedResource resource = new SharedResource();

        Thread thread1 = new Thread(()->{
                resource.read(lock);
        });
        Thread thread1_1 = new Thread(()->{
            resource.read(lock);
        });

        Thread thread2 = new Thread(()->{

                resource.read(lock);

        });
        //two write thread but only one will be able to acquire write lock
        Thread thread3 = new Thread(()->{
            resource.write(lock);

        });
        SharedResource resource2 = new SharedResource();
        Thread thread4 = new Thread(()->{
            resource.write(lock);

        });
        thread1.start();
        thread1_1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
