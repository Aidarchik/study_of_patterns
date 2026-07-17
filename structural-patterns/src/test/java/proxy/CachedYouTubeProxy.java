package proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedYouTubeProxy implements ThirdPartyYouTubeLib {

    private final ThirdPartyYouTubeLib realService = new RealYouTubeDownloader();

    private final Map<String, String> cache = new HashMap<>();

    @Override
    public String downloadVideo(String video) {

        if (cache.containsKey(video)) {
            System.out.println("Прокси: Возвращаю видео " + video + " Из КЭША.");
            return cache.get(video);
        }

        String videoData = realService.downloadVideo(video);
        cache.put(video, videoData);
        return videoData;
    }
}
