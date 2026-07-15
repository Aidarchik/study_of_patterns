package singleton;

public class DataBaseConnection {
    private static DataBaseConnection instance;

    public DataBaseConnection() {
    }

    public static DataBaseConnection getInstance() {

        if (instance == null) {
            instance = new DataBaseConnection();
        }

        return instance;
    }

    public void connect() {
        System.out.println("Singleton");
    }

    public void connect(String root, String number) {
        System.out.println(root + " " + number);
    }
}
