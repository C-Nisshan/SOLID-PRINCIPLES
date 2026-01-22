package liskov_substitution.vehicle.bad_design;

public class Vehicle {
    public void startEngine(){
        System.out.println("Engine has been started.");
    }

    public void accelerate(){
        System.out.println("Vehicle accelerating.");
    }
}
