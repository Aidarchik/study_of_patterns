package adapter;

public class XmlToJsonAdapter implements JsonTarget {
    private final LegacyXmlSensor legacyXmlSensor;

    public XmlToJsonAdapter(LegacyXmlSensor legacyXmlSensor) {
        this.legacyXmlSensor = legacyXmlSensor;
    }

    @Override
    public String getJsonData() {
        String xml = legacyXmlSensor.getXmlData();

        System.out.println("Адаптер: конвертирую XML в JSON...");
        String json = "{ \"x\": 55.75, \"y\": 37.61 }";
        return json;
    }
}
