package command;

public class TurnOnLightCommand implements Command {
    private final LightCommand light;

    public TurnOnLightCommand(LightCommand light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }
}
