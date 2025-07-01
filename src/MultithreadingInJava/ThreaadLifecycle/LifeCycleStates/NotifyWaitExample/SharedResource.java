package MultithreadingInJava.ThreaadLifecycle.LifeCycleStates.NotifyWaitExample;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    boolean isAvailable = false;

    Queue<Integer> commonQueue ;
    int capacity;

    SharedResource( int capacity){
        this.commonQueue = new LinkedList<>();
        this.capacity=capacity;
    }

    public synchronized int produce(int item) throws InterruptedException {

        while(commonQueue.size()==capacity){
            System.out.println("Queue is full waiting ");
            wait();
        }
        notify();
        commonQueue.add(item);
        System.out.println("Produced items: "+item +"by Thread :"+ Thread.currentThread().getName());
        return item;
    }
    public synchronized int consume() throws InterruptedException {
        int item = -1;
        while(commonQueue.isEmpty()){
            System.out.println("Queue is empty waiting for producer");
            wait();

        }

        item = commonQueue.poll();
        System.out.println("consumed items: "+item +"by Thread :"+ Thread.currentThread().getName());
        notify();
        return item;
    }
}
