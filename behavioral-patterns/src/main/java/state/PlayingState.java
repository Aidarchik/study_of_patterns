package state;

public class PlayingState implements PlayerState {
    @Override
    public void clickPlay(AudioPlayer player) {
        System.out.println("Плеер: ставлю музыку на паузу.");
        player.setState(new ReadyState());
    }
}
