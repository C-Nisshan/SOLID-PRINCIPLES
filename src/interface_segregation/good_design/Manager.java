package interface_segregation.good_design;

public class Manager implements Workable,ClientAttendable,Manageable{
    @Override
    public void work() {
        manageTeam();
    }

    @Override
    public void manageTeam() {
        System.out.println("Manager managing team...");
    }

    @Override
    public void attendClientMeetings() {
        System.out.println("Manager attending client meetings...");
    }
}
