package command;

import org.junit.jupiter.api.Test;

public class RemoteControlTest {
    @Test
    void shouldExecuteLightCommand() {
        LightCommand livingRoomLight = new LightCommand();
        Command switchOn = new TurnOnLightCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(switchOn);
        remote.pressButton();

        AirConditioner ac = new AirConditioner();
        Command turnOnAc = new TurnOnAcCommand(ac);

        remote.setCommand(turnOnAc);
        remote.pressButton();

        TV tv = new TV();
        Command turnOffTV = new TurnOffTVCommand(tv);

        remote.setCommand(turnOffTV);
        remote.pressButton();
    }
}
