package Patterns.WithstrategyPattern;
import Patterns.WithstrategyPattern.Strategy.SportsDriveStrategy;
public class SportsVehicle extends Vehicle {

    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
