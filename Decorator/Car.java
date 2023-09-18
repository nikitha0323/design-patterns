package Decorator;

import java.util.ArrayList;

public class Car extends Vehicle{

    public Car()
    {
        super(new ArrayList<>());
        this.lines.addAll(FileReader.getLines("car.txt"));
    }
    
}
