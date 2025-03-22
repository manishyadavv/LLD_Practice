package NestedClasses;

public class NonStaticClass {
    // In these non static classes are nested in outer class it has all the access of outer class

    int instanceVariable = 4;
    static int classVariable = 8;

    public class innerNestedClass{
        public void print(){
            System.out.println("Instance Variable"+instanceVariable + "class variable"+ classVariable);
        }
    }

}
