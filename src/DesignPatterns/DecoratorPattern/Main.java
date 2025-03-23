package DesignPatterns.DecoratorPattern;

import DesignPatterns.DecoratorPattern.Decorator.ExtraCheese;
import DesignPatterns.DecoratorPattern.Decorator.ExtraMushroom;

public class Main {

    public static void main(String args[]){

        // We decorated Margharita with extra cheese and with extramushroom
        BasePizza basePizza = new ExtraMushroom(new ExtraCheese(new Margharita()));
        System.out.println("Cost of pizza is now "+basePizza.cost());
    }
}
