package liskov_substitution.vehicle.good_design;

public class Car extends Vehicle implements MotorizedVehicle{
    @Override
    public void startEngine() {
        System.out.println("Car engine has been started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating faster.");
    }
}
