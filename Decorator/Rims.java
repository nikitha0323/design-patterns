package Decorator;

import java.util.ArrayList;

public class Rims extends VehicleDecorator{
    public Rims(Vehicle v)
    {
        super(v);
        integrateDecor(FileReader.getLines("rims.txt"));
    }

    public void integrateDecor(ArrayList<String> d)
    {
        this.lines.addAll(d);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }
    
}
