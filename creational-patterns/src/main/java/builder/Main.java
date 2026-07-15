package builder;

public class Main {

    public static void main(String[] args) {

        Computer comp = new Computer.Builder()
                .setCPU("Interl i9")
                .setRam(32)
                .setGraphicsCardEnabled(true)
                .build();
    }
}
