package interface_segregation.good_design;

public class SoftwareEngineer implements Codable,Workable{
    @Override
    public void work() {
        writeCode();
    }

    @Override
    public void writeCode() {
        System.out.println("Engineer writing code...");
    }
}
