package observer;

public class EmailSubscriber implements ObserverComposite {
    @Override
    public void update(String news) {
        System.out.println("EmailSubscriber.update: news = " + news);
    }
}
