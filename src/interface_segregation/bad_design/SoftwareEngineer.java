package interface_segregation.bad_design;

public class SoftwareEngineer implements Employee{

    public void work(){
        writeCode();
    }

    @Override
    public void manageTeam() {
        // Software engineers don't manage teams,
        // so we are forced to provide a blank/dummy implementation.
    }

    @Override
    public void attendClientMeetings() {
        // Only some engineers attend meetings, another forced implementation.
    }

    @Override
    public void writeCode() {
        System.out.println("Engineer writing code...");
    }
}
