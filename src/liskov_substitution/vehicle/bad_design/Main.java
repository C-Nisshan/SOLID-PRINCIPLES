package liskov_substitution.vehicle.bad_design;

public class Main
{
    public static void main(String[] args){
        Vehicle car = new Car();
        car.startEngine();

        Vehicle bicycle = new Bicycle();
        bicycle.startEngine();

    }
}
