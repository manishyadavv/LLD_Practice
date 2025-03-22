package GenericClassesImp;

// we are creating more than one type of generic class
public class Pair<T,K> {
    T key;
    K value;
    public void put(T key, K value){
        this.key=key;
        this.value=value;
    }
    public T getKey(){
      return key;
    }
}
/*
public class Main{
    public static void main(String args[]){
        Pair<Integer, String> p = new Pair<>();
        p.put(1,"one");
    }
}

 */
