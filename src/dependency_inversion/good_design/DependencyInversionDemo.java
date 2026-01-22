package dependency_inversion.good_design;

// Main class to assemble the application
public class DependencyInversionDemo {
    public static void main(String[] args) {
        // We can easily switch implementations without changing the Application class

        // Use MySQL
        IDatabase mySqlDb = new MySQLDatabase();
        Application appWithMySQL = new Application(mySqlDb);
        appWithMySQL.run();

        System.out.println("\nSwitching to MongoDB...\n");

        // Use MongoDB
        IDatabase mongoDb = new MongoDBDatabase();
        Application appWithMongoDB = new Application(mongoDb);
        appWithMongoDB.run();
    }
}
