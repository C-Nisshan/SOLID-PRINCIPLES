package liskov_substitution.vehicle.bad_design;

public class Bicycle extends Vehicle{
    // Bicycles do not have engines, so this method doesn't make sense

    /*
        What LSP really says
            Objects of a superclass should be replaceable with objects of
            its subclasses without breaking the correctness of the program.

        Key LSP rule being violated - Subclasses must not remove behavior promised by the base class

            Vehicle promises - “I can start an engine”
            Bicycle says - “Actually, I can’t”

            That’s the violation — not whether a message can be printed.
     */
    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Bicycles don't have engines!"); // LSP Violation
    }
}
