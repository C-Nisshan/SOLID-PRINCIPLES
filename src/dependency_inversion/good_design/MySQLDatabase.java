package dependency_inversion.good_design;

// Low-level concrete module depends on the abstraction
class MySQLDatabase implements IDatabase {
    @Override
    public void save(String data) {
        System.out.println("Saving " + data + " to MySQL Database...");
    }
}
