package dependency_inversion.good_design;

// Another low-level concrete module depends on the abstraction
class MongoDBDatabase implements IDatabase {
    @Override
    public void save(String data) {
        System.out.println("Saving " + data + " to MongoDB Database...");
    }
}
