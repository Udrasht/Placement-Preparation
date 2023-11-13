package Patterns.Factory;

import Patterns.Factory.DifferShape.Shape;

public class main {
    public static void main(String[] args){
        Factory f1=new Factory();
        Shape S1= f1.getShape("Rectangle");
        Shape S2= f1.getShape("Circle");
         S1.draw();
         S2.draw();
    }
    
}
