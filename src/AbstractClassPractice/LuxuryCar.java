package AbstractClassPractice;

public abstract class LuxuryCar extends Car{

    LuxuryCar(int carNumber){
        super(carNumber);
    }
    //this child class either can provide the implementation of the abstract methods in CAR or add further more abstractions
    //
    public abstract void applyDoubleBreaks();

    //implementations or logic goes here
    @Override
    public void applyBreaks(){
        System.out.println("Breaks Applied");
    }
}
