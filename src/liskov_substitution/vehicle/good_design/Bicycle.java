package liskov_substitution.vehicle.good_design;

public class Bicycle extends Vehicle{
    // Bicycle does not implement MotorizedVehicle, so no startEngine() method is expected here
    @Override
    public void accelerate() {
        System.out.println("Bicycle accelerating with pedal power.");
    }
}
