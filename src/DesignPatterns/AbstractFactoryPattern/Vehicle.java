package DesignPatterns.AbstractFactoryPattern;


// abstract factory pattern is Factory of Factories

// This is used when we have some types of entities like vehicles luxury1(bmw) luxury2(audi) luxuyry3(mercedes) and oridinary vehicle1 oridinary vehicle2
// so we can group all luxury vehicles with one interface and oridinary with one , meaning one factory returns all oridinary and one return all
// so we add is-a relationship to Factory1 like oridinary and luxury with factory1 and factory2 has-a relationship with factory1,
// meaning factory1 return luxury or oridinary vehicle objects and factory 2 return factory1 objects
//https://www.youtube.com/watch?v=7g9S371qzwM&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=7
// luxury vehicles
public class Vehicle {
}
