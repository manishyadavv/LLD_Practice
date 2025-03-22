

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyMonitorLockClass obj = new MyMonitorLockClass();

        SharedResource sharedResource = new SharedResource();

        Thread t1= new Thread(()->{obj.task1();});
        Thread t2 = new Thread(()->{obj.task2();});
        Thread t3 = new Thread(()->{obj.task3();});

//        Thread t4 = new Thread(()->{
//            sharedResource.addOne(true);
//        });
//        Thread t5 = new Thread(()->{
//            sharedResource.addOne(false);
//        });
//
//        t4.start();
//        t5.start();

        //PRODUCER CONSUMER PROBLEM
        ProducerConsumer producerConsumer= new ProducerConsumer(3);
        Thread producer = new Thread(()->{
            for(int i=0;i<=6;i++){
                try {
                    producerConsumer.producer(i);
                } catch (InterruptedException e) {

                }
            }
        });
        Thread consumer = new Thread(()->{
            for(int i=0;i<=6;i++){
                try {
                    int consumed= producerConsumer.consumer();
                    System.out.println("consumed "+consumed);
                } catch (InterruptedException e) {

                }
            }
        });
        producer.start();
        consumer.start();

        ReadWriteLock lock = new ReentrantReadWriteLock() ;

        Thread th1= new Thread(()->{
            sharedResource.addOne(true,lock);
        });
        th1.start();
    }
}