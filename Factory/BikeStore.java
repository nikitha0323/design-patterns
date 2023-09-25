package Factory;



public class BikeStore
 {
    public Bike createBike(String type) 
    {
        switch (type.toLowerCase()) 
        {
            case "tricycle":
                return new Tricycle();
            case "strider":
                return new Strider();
            case "kids bike":
                return new KidsBike();
            default:
                return null;
        }
    }
}
    

