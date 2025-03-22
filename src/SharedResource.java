import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    int value=0;
    private boolean turn = true; // true for Thread-1, false for Thread-2

    public synchronized void addOne(boolean isThread1, ReadWriteLock lock) {
        while(value<10){ // Repeat the function execution
            while (turn != isThread1 ) {
                try {
                    lock.readLock().lock();
                    value+=1;
                    wait(); // Wait until it's this thread's turn
                    lock.readLock().unlock();
                    // releases all the monitor locks
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(value + " - " + Thread.currentThread().getName());
            turn = !turn; // Switch turn
            notifyAll();  // Notify other waiting thread
        }
    }
}
