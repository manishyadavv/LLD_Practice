package MultithreadingInJava.LocksAndConditions.ThreadConditions;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;

    public void producer(ReentrantLock lock, Condition condition)  {
        try{
            lock.lock();
            System.out.println("Read Lock acquired by thread"+Thread.currentThread().getName());

            if(isAvailable){
                condition.await();
            }
            isAvailable=true;
            condition.signal();
        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println("Read Lock Lock released by thread"+Thread.currentThread().getName());
        }

    }
    public void consumer(ReentrantLock lock, Condition condition)  {
        try{
            lock.lock();
            System.out.println("Write Lock acquired by thread"+Thread.currentThread().getName());
            if(!isAvailable){
                condition.await();
            }
            isAvailable = false;
            condition.signal();

        }catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println("Write Lock  released by thread"+Thread.currentThread().getName());
        }

    }

}
