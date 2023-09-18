package Decorator;

import java.util.ArrayList;

public class Smile extends VehicleDecorator{
    public Smile(Vehicle v)
    {
        super(v);
        integrateDecor(FileReader.getLines("smile.txt"));
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
