package Patterns.WithstrategyPattern;
import Patterns.WithstrategyPattern.Strategy.NormalDrive;

public class Pessengervechile extends Vehicle {

    Pessengervechile(){
        super(new NormalDrive());
    }
}
