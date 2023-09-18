package Decorator;

import java.util.ArrayList;

public class Vehicle {
    protected ArrayList<String> lines;

    public Vehicle(ArrayList<String> lines)
    {
        this.lines = lines;
    }

   public String toString()
   {
    StringBuilder sb = new StringBuilder();
    for(String line : lines)
    {
        sb.append(line).append("\n");
    
    }
    return sb.toString();


   }
    
}
