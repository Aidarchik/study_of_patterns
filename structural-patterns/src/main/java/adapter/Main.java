package adapter;

public class Main {

    public static void main(String[] args) {

        LegacyXmlSensor xmlSensor = new LegacyXmlSensor();

        ModernJsonNavigator navigator = new ModernJsonNavigator(new XmlToJsonAdapter(xmlSensor));

        navigator.showLocation();
    }
}
