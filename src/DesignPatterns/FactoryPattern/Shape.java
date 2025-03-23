package DesignPatterns.FactoryPattern;


// Idea of factory pattern is if we are creating objects conditionally like if(condition) true to hi create this
// so if we want to have this object in 50 places than so many conditions will be added everywhere to overcome this we
// use factory pattern
public interface Shape {
    void draw();
}
