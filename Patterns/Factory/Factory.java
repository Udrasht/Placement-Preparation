package Patterns.Factory;

import Patterns.Factory.DifferShape.Circle;
import Patterns.Factory.DifferShape.Rectangle;
import Patterns.Factory.DifferShape.Shape;
import Patterns.Factory.DifferShape.Squre;

public class Factory {
    public Shape getShape(String Shape){
        switch(Shape){
            case "Rectangle":
                return new Rectangle();
            case "Circle":
                return new Circle();
            case "Square":
                 return new Squre();
            default: 
                return null;
          
            
        }

    }
    
}
