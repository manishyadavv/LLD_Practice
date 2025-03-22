package GenericClassesImp;

// because of the typecasting issue while using Object typed object its difficult for compiler to know if its a Integer type or String etc
// So we use Generic class for thi s
/*public class Print {
    Object value;

    public Object getPrintValue(){
        return value;
    }
    public void setPrintValue(Object value){
        this.value=value;
    }

}
public class Main(){
    public static void main(String args[]){
        Print printObj1= new Print();
        printObj1.setPrintValue(1);
        Object printValue = printObj1.getPrintValue();

        if((int)printValue==1){
            //do something
        }
    }
}

 */
public class Print<T> {
    T value;
    public T getPrintValue(){
        return value;
    }
    public void setPrintValue(T value){
        this.value=value;
    }
}

//public class Main() {
//    public static void main(String args[]) {
//        Print<Integer> printObj1 = new Print<Integer>();
//        printObj1.setPrintValue(1);
//        Integer printValue = printObj1.getPrintValue();
//
//        if (printValue == 1) {
//            //do something
//            System.out.println("Generic class worked");
//        }
//    }
//}