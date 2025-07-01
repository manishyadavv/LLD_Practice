package MultithreadingInJava.LocksAndConditions.ReentrantLock;


import java.util.concurrent.locks.ReentrantLock;

public class SharedResource2 {
    boolean isAvailable = false;

    public void produce(ReentrantLock lock)  {
        try{
            lock.lock();
            System.out.println("Lock acquired by thread"+Thread.currentThread().getName());

            isAvailable=true;
            Thread.sleep(5000);

        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println("Lock released by thread"+Thread.currentThread().getName());
        }

    }

}
