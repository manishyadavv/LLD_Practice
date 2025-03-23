package DesignPatterns.StrategyDesignPattern.WithStrategyPattern.Strategy;

public class NormalStrategyDriving implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal drive strategy");
    }
}
