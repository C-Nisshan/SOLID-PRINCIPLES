package liskov_substitution.vehicle.bad_design;

public class Car extends Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Car accelerating faster.");
    }
}
