package dependency_inversion.good_design;

// High-level module depends on the abstraction
class Application {
    private IDatabase database;

    // Dependency Inversion: dependency is injected via constructor
    public Application(IDatabase database) {
        this.database = database;
    }

    public void run() {
        database.save("user data");
    }
}