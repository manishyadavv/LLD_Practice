package MultithreadingInJava.LocksAndConditions.StampedLock.OptimisticReadStampedLock;

import java.util.concurrent.locks.StampedLock;

public class OptimisticReadMain {
    public static void main(String args[]){
        /*
        Optimistic read type locks adding
        Its just before updating the record or doing update etc checkingif stamp is the same
        we got before
         */
        StampedLock newLock = new StampedLock();
        SharedResourceOptimistic sharedResourceOptimistic = new SharedResourceOptimistic();

        Thread thread4 = new Thread(()->{
            sharedResourceOptimistic.write(newLock);
        });
        Thread thread5 = new Thread(()->{
            sharedResourceOptimistic.read(newLock);
        });
        thread4.start();
        thread5.start();
    }
}
