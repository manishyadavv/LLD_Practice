package MultithreadingInJava.ThreaadLifecycle.MonitorLocks;

public class MonitorMain {
    public static void main(String args[]){

        MonitorLocks monitorLocks = new MonitorLocks();

        Thread thread1 = new Thread(()->{
            monitorLocks.task1();
            try {
                monitorLocks.task2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            monitorLocks.task3();
        });

        Thread thread2 = new Thread(()->{
            monitorLocks.task1();
            try {
                monitorLocks.task2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            monitorLocks.task3();
        });
        thread1.start();
        thread2.start();
    }
}
