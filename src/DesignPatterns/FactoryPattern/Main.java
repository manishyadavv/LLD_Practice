package DesignPatterns.FactoryPattern;

public class Main {
    public static void main(String args[]){

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeObj = shapeFactory.getShape("Circle");
        shapeObj.draw();
    }
}
