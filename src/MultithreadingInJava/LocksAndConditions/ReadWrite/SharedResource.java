package MultithreadingInJava.LocksAndConditions.ReadWrite;


import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    int value = 1;

    public void read(ReadWriteLock lock)  {
        try{
            lock.readLock().lock();
            System.out.println("Read Lock acquired by thread"+Thread.currentThread().getName());

           Thread.sleep(5000);

        }catch (Exception e){

        }finally {
            lock.readLock().unlock();
            System.out.println("Read Lock Lock released by thread"+Thread.currentThread().getName());
        }

    }
    public void write(ReadWriteLock lock)  {
        try{
            lock.writeLock().lock();
            System.out.println("Write Lock acquired by thread"+Thread.currentThread().getName());

            this.value=this.value+1;
            System.out.println("Value is :"+value);
            Thread.sleep(5000);

        }catch (Exception e){

        }finally {
            lock.writeLock().unlock();
            System.out.println("Write Lock  released by thread"+Thread.currentThread().getName());
        }

    }

}
