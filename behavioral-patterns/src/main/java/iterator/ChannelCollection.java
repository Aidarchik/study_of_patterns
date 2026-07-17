package iterator;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollection {
    private final List<String> channels = new ArrayList<>();

    public void addChannel(String name) {
        this.channels.add(name);
    }

    public MyIterator createIterator() {
        return new ChannelIterator(this.channels);
    }
}
