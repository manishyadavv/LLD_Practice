package AbstractClassPractice;

//In abstract class we can add abstract methods(like hiding the implementations) or also can add non abstract methods having actual logic
//Another point is we cannot create object of abstract class
//only for concrete class we can do new Audi(); But we can store the reference in abstract class like LuxuryCar lxc = new Audi();
public abstract class Car {
    int carNumber;
    Car(int carNumber){
        this.carNumber= carNumber;
    }
    public abstract void applyBreaks();
    public abstract void accelerate();

    public int carDetails(){
        return 4;
    }
}


