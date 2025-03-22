package NestedClasses;

public class OuterClass {

    int instanceVariable=4;
    static int classVariable = 5;

    // We have created a static class inside the outerclass because we know this class can only be used by only this class and instead of ccreating a new class
    // we can create a nested class;
    // static class can only access the static variables of the outer class not the other ones
    public static class NestedClass {
        public void printVariables() {
            //can't access instanceVariable
//            System.out.println("Instance Variable" + classVariable + instanceVariable);
            //can only access
            System.out.println("Variable" + classVariable );

        }
    }
}
