package state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AudioPlayerTest {
    @Test
    void shouldTogglePlayerState() {
        AudioPlayer player = new AudioPlayer();

        assertTrue(player.getState() instanceof ReadyState);

        checkPlayingTransition(player);

        checkReadingTransition(player);

    }

    private static void checkReadingTransition(AudioPlayer player) {
        player.pressPlay();
        assertTrue(player.getState() instanceof ReadyState);
    }

    private static void checkPlayingTransition(AudioPlayer player) {
        player.pressPlay();
        assertTrue(player.getState() instanceof PlayingState);
    }
}
