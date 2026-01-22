package dependency_inversion.bad_design;

// Low-level concrete module
class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving " + data + " to MySQL Database...");
    }
}
