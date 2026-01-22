package liskov_substitution.vehicle.good_design;

// A more generic Vehicle class with only common behaviors
public class Vehicle {
    public void accelerate()
    {
        System.out.println("Vehicle accelerating...");
    }
}
