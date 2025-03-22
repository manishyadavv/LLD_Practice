package AbstractClassPractice;

//Note this is not a abstract class its a concrete class
// so it has to implement its parent's abstract methods

public class Audi extends LuxuryCar{

    int carNumber;
    public Audi(int carNumber){
        super(carNumber);
    }

    @Override
    public void applyDoubleBreaks(){
        System.out.print("Double breaks applied");
    }
    @Override
    public void accelerate(){
        System.out.println("Parent's parent abstract methods implemented");
    }
}
