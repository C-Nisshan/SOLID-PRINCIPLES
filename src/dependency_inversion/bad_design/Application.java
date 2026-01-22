package dependency_inversion.bad_design;

// High-level module
class Application {
    private MySQLDatabase database;

    public Application() {
        // Direct instantiation and dependency on concrete class
        this.database = new MySQLDatabase();
    }

    public void run() {
        database.save("user data");
    }
}
