package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel {
    private final List<ObserverComposite> subscribers = new ArrayList<>();


    public void subscribe(ObserverComposite observer) {
        this.subscribers.add(observer);
    }

    public void publishNews(String news) {
        for (ObserverComposite subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}
