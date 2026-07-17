package command;

public class TurnOnAcCommand implements Command {
    private final AirConditioner airConditioner;

    public TurnOnAcCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        this.airConditioner.setTemperature(22);
    }
}
