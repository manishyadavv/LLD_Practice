package MultithreadingInJava.ThreaadLifecycle.DaemonThread;

import MultithreadingInJava.ThreaadLifecycle.MonitorLocks.MonitorLocks;

public class DaemonThreadMain {
    public static void main(String args[]){
        /*
            So Daemon thread is whose scope stays till the scope of main thread remains,
            main stops daemon stops
            examples of daemon are auto-save functionality
            also another one is logging system running till then
            aslo helpfull in garbage collector whenever jvm is running it keeps on running
         */


        System.out.println("Main thread started: "+ Thread.currentThread().getName());
        MonitorLocks sharedResource = new MonitorLocks();
        Thread thread1 = new Thread(()->{
            sharedResource.task1();
        });
        //before starting the thread we need to mark it daemon
        thread1.setDaemon(true);
        thread1.start();


        System.out.println("Main thread ended: "+ Thread.currentThread().getName());

    }
}
