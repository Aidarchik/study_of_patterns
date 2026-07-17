package observer;

import org.junit.jupiter.api.Test;

public class NotificationTest {
    @Test
    void shouldNotifySubscribers() {

        NewsChannel channel = new NewsChannel();

        ObserverComposite sub1 = new EmailSubscriber();

        channel.subscribe(sub1);

        channel.publishNews("Вышло новое видео по паттернам!");
    }
}
