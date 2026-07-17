package proxy;

public class RealYouTubeDownloader implements ThirdPartyYouTubeLib {
    @Override
    public String downloadVideo(String video) {
        System.out.println("Скачивание видео " + video + " с серверов YouTube... (Дорогой процесс)");
        return "Video Data: " + video;
    }
}
