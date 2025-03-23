package DesignPatterns.FactoryPattern;

public class ShapeFactory {

    //Factory here shape tells that if you want object I am the source of truth call me I'll return
    // the objects
    Shape getShape(String shapeInput){

        switch(shapeInput){
            case "Circle": return new Circle();

            case "Square": return new Square();

            case "Rectangle": return new Rectangle();
            default: return null;
        }
    }
}
