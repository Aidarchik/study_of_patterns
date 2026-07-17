package proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YouTubePlayerTest {
    @Test
    void shouldCacheVideoDownloads() {
        ThirdPartyYouTubeLib youtubeProxy = new CachedYouTubeProxy();

        String video1 = youtubeProxy.downloadVideo("cat_video");
        String video2 = youtubeProxy.downloadVideo("cat_video");

        assertEquals("Video Data: cat_video", video1);
        assertEquals(video1, video2);

    }
}
