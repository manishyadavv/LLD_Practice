package MultithreadingInJava.LocksAndConditions.ThreadConditions;



import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadConditionsMain {
    public static void main(String args[]){
        /*
            CHECK
            README.md

            Used to do AWAIT AND SIGNAL APPROACHES
         */

        ReentrantLock lock = new ReentrantLock();

        Condition condition = lock.newCondition();

        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(()->{
            sharedResource.producer(lock, condition);
        });

        Thread thread2 = new Thread(()->{

            sharedResource.consumer(lock, condition);

        });

        thread1.start();
        thread2.start();
    }
}
