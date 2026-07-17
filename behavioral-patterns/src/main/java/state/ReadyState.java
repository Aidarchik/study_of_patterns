package state;

public class ReadyState implements PlayerState {
    @Override
    public void clickPlay(AudioPlayer player) {
        System.out.println("Плеер: Включаю музыку...");
        player.setState(new PlayingState());
    }
}
