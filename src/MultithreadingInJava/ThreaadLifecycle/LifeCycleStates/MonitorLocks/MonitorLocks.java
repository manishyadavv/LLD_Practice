package MultithreadingInJava.ThreaadLifecycle.LifeCycleStates.MonitorLocks;

public class MonitorLocks {
    public synchronized void task1(){
        System.out.println("Lock acquired by:"+Thread.currentThread().getName());

        try {
            Thread.sleep(10000);
        }catch (Exception ex){
            //do something
        }
        System.out.println("Lock released by:"+Thread.currentThread().getName());

    }

    public void task2() throws InterruptedException {
        System.out.println("Task 2 Lock acquired by:"+Thread.currentThread().getName());
        synchronized (this){
            System.out.println("Task 2 before thread sleep:"+Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("Task 2 after thread sleep:"+Thread.currentThread().getName());
        }

        System.out.println("Taks 2 Lock released by:"+Thread.currentThread().getName());
    }

    public void task3(){
        System.out.println("Task 3");
    }

}
