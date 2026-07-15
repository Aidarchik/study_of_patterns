package factory_method;

public class Main {

    private static NotificationFactory factory;

    public static void main(String[] args) {

        String configType  = "EMAIL";

        if (configType.equalsIgnoreCase("EMAIL")) {
            factory = new EmailNotificationFactory();
        } else if (configType.equalsIgnoreCase("SMS")) {
            factory = new SMSNotificationFactory();
        }

        Notification msg = factory.createNotification();
        msg.notifyUser();

    }
}
