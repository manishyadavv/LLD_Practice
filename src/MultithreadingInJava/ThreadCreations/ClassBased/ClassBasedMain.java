package MultithreadingInJava.ThreadCreations.ClassBased;

public class ClassBasedMain {
    public static void main(String args[]){
        /*
        Now we are going to create instance of MyClass which is extending the Thread
            -similar to runnable it has provided the implementation of run()
         */
        MyClass myThread = new MyClass();
        /*
        So here output is ,
        --
        --
        Thread is run by extending class
         */

        myThread.start();
    }
}
