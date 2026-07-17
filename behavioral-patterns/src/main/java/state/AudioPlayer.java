package state;

public class AudioPlayer {
    private PlayerState state = new ReadyState();

    public PlayerState getState() {
        return this.state;
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void pressPlay() {
        state.clickPlay(this);
    }
}
