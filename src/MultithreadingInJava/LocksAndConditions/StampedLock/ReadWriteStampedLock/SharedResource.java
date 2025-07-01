package MultithreadingInJava.LocksAndConditions.StampedLock.ReadWriteStampedLock;


import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    int value = 1;

    public void read(StampedLock lock)  {
        long stamp = lock.readLock();
        try{
            System.out.println("Read Lock acquired by thread"+Thread.currentThread().getName());

           Thread.sleep(5000);

        }catch (Exception e){

        }finally {
            lock.unlock(stamp);
            System.out.println("Read Lock Lock released by thread"+Thread.currentThread().getName());
        }

    }
    public void write(StampedLock lock)  {
            long stamp = lock.writeLock();
        try{

            System.out.println("Write Lock acquired by thread"+Thread.currentThread().getName());

            this.value=this.value+1;
            System.out.println("Value is :"+value);
            Thread.sleep(5000);

        }catch (Exception e){

        }finally {
            lock.unlock(stamp);
            System.out.println("Write Lock  released by thread"+Thread.currentThread().getName());
        }

    }

}
