package NestedClasses;


import AbstractClassPractice.Car;

// A nested class without a name is called anonoymous class
// why it is used, when we want to override the behaviour of the method without even creating any subclass;
public class AnonymousClass {

    //Lets suppose we have Car class and we dont want to extend/create subclass Audi but still want to implement the functionality
    public static void main(String args[]){

        //What happened here we cannot create instance of abstract class but we provided the implementation
        //Compiler internally creates subclass and extends the abstract Car class and used the implementation
        Car audiCarObj = new Car() {
            @Override
            public void applyBreaks() {
                System.out.println("Audi specific Break changes");
            }

            @Override
            public void accelerate() {

            }
        };

        audiCarObj.applyBreaks();
    }
}
