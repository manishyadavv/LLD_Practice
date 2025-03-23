package DesignPatterns.StrategyDesignPattern.WithStrategyPattern;

import DesignPatterns.StrategyDesignPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        //super means parent constructor
        super(new SportsDriveStrategy());
    }
}
