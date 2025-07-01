package MultithreadingInJava.ThreadCreations.ClassBased;

public class MyClass extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is run by extending class");
    }
}
