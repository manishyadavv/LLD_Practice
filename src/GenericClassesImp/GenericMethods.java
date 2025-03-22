package GenericClassesImp;

public class GenericMethods {

    //In generic methods we are defining type parameter before the return type of method declaration
    // type parameter scope is limited to method only
    public <K,V> void genericMethod(Pair<Integer,String> s, Pair<Integer, Integer> t){

            if(s.getKey().equals(t.getKey())){
                //do something
            }
    }
}
