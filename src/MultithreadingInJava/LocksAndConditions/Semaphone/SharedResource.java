package MultithreadingInJava.LocksAndConditions.Semaphone;


import java.util.concurrent.Semaphore;

public class SharedResource {
    boolean isAvailable = false;

    public void produce(Semaphore lock)  {
        try{
            lock.acquire();
            System.out.println("Lock acquired by thread"+Thread.currentThread().getName());

            isAvailable=true;
            Thread.sleep(5000);

        }catch (Exception e){

        }finally {
            lock.release();
            System.out.println("Lock released by thread"+Thread.currentThread().getName());
        }

    }

}
