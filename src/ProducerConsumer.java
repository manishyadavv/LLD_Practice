import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

     Queue<Integer> queue;
     int bufferSize;

    ProducerConsumer(int bufferSize){
        this.queue = new LinkedList<>();
        this.bufferSize=bufferSize;
    }

    public synchronized void producer(int item) throws InterruptedException {

        while(queue.size()==bufferSize){
            System.out.println("Queue is full waiting for consumer ");
            wait();
        }

        queue.add(item);
        System.out.println("Producing :"+item);
        notify();
    }

    public synchronized int consumer() throws InterruptedException {

        while(queue.isEmpty()){
            System.out.print("Waiting for producer to produce");
            wait();
        }
        int element= queue.poll();
        notify();
        return element;
//        System.out.println("Consuming :"+element);
    }

}
