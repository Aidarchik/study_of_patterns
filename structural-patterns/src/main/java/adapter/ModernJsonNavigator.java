package adapter;

public class ModernJsonNavigator {
    private final JsonTarget jsonTarget;

    public ModernJsonNavigator(JsonTarget jsonTarget) {
        this.jsonTarget = jsonTarget;
    }


    public void showLocation() {
        String json = jsonTarget.getJsonData();
        System.out.println("Навигатор успешно отображает координаты из JSON: " + json);
    }
}
