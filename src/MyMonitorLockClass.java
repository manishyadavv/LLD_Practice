public class MyMonitorLockClass {

    public synchronized void task1() {
        try {
            System.out.print("Inside Task 1");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        } catch (Exception e) {

        }
    }

    public void task2() {
        System.out.println("Inside task2 before synchronized");
        //Waiting for the monitor lock to be released and each object has its own monitor lock
        // lock is acquired by T1 above as it was synchronized
        synchronized (this) {
            System.out.print("Inside synchronized");
        }
    }

    public void task3() {
        System.out.println("Inside task 3");
    }

}
