package factory_method;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Email sends");
    }
}
