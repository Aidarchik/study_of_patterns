package singleton;

public class Main {

    public static void main(String[] args) {

        DataBaseConnection connection = DataBaseConnection.getInstance();
        connection.connect("root", "1235");
        connection.connect();

    }

}
