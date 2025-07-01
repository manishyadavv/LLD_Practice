package MultithreadingInJava.LocksAndConditions.StampedLock.OptimisticReadStampedLock;


import java.util.concurrent.locks.StampedLock;

public class SharedResourceOptimistic {
    int a = 10;

    public void read(StampedLock lock){
        long stamp = lock.writeLock();
        System.out.println("Write Lock acquired by thread"+Thread.currentThread().getName());
        try{
            System.out.println("Performed update"+Thread.currentThread().getName());
            a=9;
        }finally {
            lock.unlock(stamp);
        }
    }
    public void write(StampedLock lock)  {
            long stamp = lock.tryOptimisticRead();
        try{
            System.out.println("Taken Optimistic Lock by thread"+Thread.currentThread().getName());
            if(lock.validate(stamp)){
                a=11; Thread.sleep(5000);
                 System.out.println("Updated by optimisitic read by thread"+Thread.currentThread().getName());
            }else {
                a=10;
                System.out.println("Rollback done by thread"+Thread.currentThread().getName());
            }



        }catch (Exception e){

        }

    }

}
