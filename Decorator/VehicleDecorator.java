package Decorator;

import java.util.ArrayList;

public abstract class VehicleDecorator extends Vehicle {
    protected Vehicle decoratedVehicle; 

    public VehicleDecorator(Vehicle decoratedVehicle)
    {
        super(new ArrayList<>());
        this.decoratedVehicle = decoratedVehicle;
    }

    public abstract String toString();
    
}
