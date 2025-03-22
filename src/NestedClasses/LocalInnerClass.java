package NestedClasses;

public class LocalInnerClass {
    int instanceVariable = 4;
    static int classVariable = 8;

    //Local inner classes are the ones who are created inside function/ if /for/ loops etc
    public void display() {
        //local inner class cannot have access modifiers defined
         class localInnerClassNested {
            public void print() {
                System.out.println("Instance Variable" + instanceVariable + "class variable" + classVariable);
            }
        }
        localInnerClassNested localInnerClassNested = new localInnerClassNested();
        localInnerClassNested.print();
    }
}
