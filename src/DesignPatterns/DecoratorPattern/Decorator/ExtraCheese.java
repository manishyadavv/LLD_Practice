package DesignPatterns.DecoratorPattern.Decorator;

import DesignPatterns.DecoratorPattern.BasePizza;

public class ExtraCheese extends ToppingsDecorator{

    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+50;
    }
}
