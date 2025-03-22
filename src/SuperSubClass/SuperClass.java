package SuperSubClass;


import AbstractClassPractice.Audi;
import NestedClasses.NonStaticClass;
import NestedClasses.OuterClass;

//If a class doesnt extend and other parent class(super class) in JAVA it before the scenes always implecitly subclass of Object class
// As we know we can store the refernce of the object in its parent class so sometimes we dont know where to store the reference of object whilw
// working in subclasses we can always store the reference in Object class;
public class SuperClass {
    public static void main(String args[]){
        //we stored the reference in Object could have done like Audi obj1 = new Audi(23);
       /* Object obj1= new Audi(23);

        System.out.println("Object class " + obj1.getClass());

        */

        /*
        Nested usage
        OuterClass.NestedClass outerClass = new OuterClass.NestedClass();
        outerClass.printVariables();

         */
        //using outer class to create obj of non static inner nested class
        NonStaticClass outerClass= new NonStaticClass();

        NonStaticClass.innerNestedClass o = outerClass.new innerNestedClass();

    }
}
