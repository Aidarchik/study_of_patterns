package factory_method;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS sends");
    }
}
