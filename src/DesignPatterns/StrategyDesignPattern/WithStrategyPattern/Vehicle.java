package DesignPatterns.StrategyDesignPattern.WithStrategyPattern;

import DesignPatterns.StrategyDesignPattern.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    // Idea is if multiple classes are extending parent class and in child classes if there is code
    // duplilcacy happening and both sub classes have same kind of work then we can take out the common
    // part in interface and implement it as subclass

    // we didnt do driveObject = new NormalStrategyDriving because we did contructor injection
    // and we would have needed to create multiple such objects
    DriveStrategy driveObject;

    Vehicle(DriveStrategy driveStrategy){
        this.driveObject = driveStrategy;
    }
    public void drive(){
        driveObject.drive();
    }
}
