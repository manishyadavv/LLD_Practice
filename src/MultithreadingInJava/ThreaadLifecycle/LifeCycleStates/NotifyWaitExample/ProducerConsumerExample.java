package MultithreadingInJava.ThreaadLifecycle.LifeCycleStates.NotifyWaitExample;

public class ProducerConsumerExample {
    public static void main(String args[]){
        /*
        in all these comes back means coming back to runnable/running state
        whenever IO task comes it acquires lock and goes to BLOCKED state, IO done lock released : same as lockings
        wait() makes thread put in WAITING state and notify does is pull back from
        sleep() or Join() does is putt.3
        +ing thread into TIMES_WAITING state and when sleep time expires or join completes comes back
         */

        /*
        PRODUCER CONSUMER TASK
         */

        SharedResource sharedResource = new SharedResource(3);

        Thread producer = new Thread(()->{

            for(int i=0;i<10;i++){
                try {
                    int item = sharedResource.produce(i);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread consumer = new Thread(()->{

            for(int i=0;i<10;i++){
                try {
                    int item = sharedResource.consume();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producer.start();
        consumer.start();

    }
}
