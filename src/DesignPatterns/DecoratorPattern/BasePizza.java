package DesignPatterns.DecoratorPattern;


// Decorator pattern means we have base pizza and we can decorate it with more toppings
// one type can be farmhouse pizza another can be margharita, both these class have a is-a relationship(means inheritence is there bwtween them) with the base class
// so we create a decorator class which has BOTH IS-A and HAS-A relation ship with the base class(means once class contains an instance of another
//// class as a member Variable)
public abstract class BasePizza {
    public abstract int cost();
}
