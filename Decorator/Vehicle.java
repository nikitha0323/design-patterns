package Decorator;

import java.util.ArrayList;

public class Vehicle {
    protected ArrayList<String> lines;

    public Vehicle(ArrayList<String> lines)
    {
        this.lines = lines;
    }

    public void setColor(String c)
    {
        lines.add(c);
    }

    public String toString()
    {
        StringBuilder result = new StringBuilder();
        for(String l : lines)
        {
            result.append(l).append("\n");
        }
        return result.toString();
    }

    public ArrayList<String> getLines() {
        return null;
    }
    
}
