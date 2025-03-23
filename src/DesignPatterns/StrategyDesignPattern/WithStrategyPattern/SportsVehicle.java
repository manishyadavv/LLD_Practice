package DesignPatterns.StrategyDesignPattern.WithStrategyPattern;

import DesignPatterns.StrategyDesignPattern.WithStrategyPattern.Strategy.DriveStrategy;
import DesignPatterns.StrategyDesignPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

    // by using super we are calling parent function
    SportsVehicle() {
        //super means parent constructor
        super(new SportsDriveStrategy());
    }
}
