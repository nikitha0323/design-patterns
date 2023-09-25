package Factory;

public class Bike 
{
    private String name;
    private double price;
    private int numWheels;
    private boolean hasPedals;
    private boolean hasTrainingWheels;

    public Bike(String name, double price, int numWheels, boolean hasPedals, boolean hasTrainingWheels) 
    {
        this.name = name;
        this.price = price;
        this.numWheels = numWheels;
        this.hasPedals = hasPedals;
        this.hasTrainingWheels = hasTrainingWheels;
    }

    public String assembleBike() 
    {
        StringBuilder assemblyProcess = new StringBuilder();

        assemblyProcess.append("Creating a ").append(name).append("\n");
        assemblyProcess.append("- Assembling ").append(name).append(" frame\n");
        assemblyProcess.append("- Adding ").append(numWheels).append(" wheel(s)\n");

        if (hasPedals) 
        {
            assemblyProcess.append("- Adding pedals\n");
        }

        if (hasTrainingWheels) 
        {
            assemblyProcess.append("- Adding training wheels\n");
        }

        return assemblyProcess.toString();
    }

    public double getPrice() 
    {
        return price;
    }
}

