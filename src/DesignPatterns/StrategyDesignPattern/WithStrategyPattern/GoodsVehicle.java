package DesignPatterns.StrategyDesignPattern.WithStrategyPattern;

import DesignPatterns.StrategyDesignPattern.WithStrategyPattern.Strategy.NormalStrategyDriving;

public class GoodsVehicle extends Vehicle{

    // we are calling these type objects and in Vehicle class they go and use
    // normalStrategyDriving.drive() ,, in Vehicle object we are doing constructor injection
    GoodsVehicle(){
        super(new NormalStrategyDriving());
    }
}
