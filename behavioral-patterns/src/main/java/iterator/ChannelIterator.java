package iterator;

import java.util.List;

public class ChannelIterator implements MyIterator {
    private final List<String> list;
    private int position = 0;

    public ChannelIterator(List<String> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public String next() {
        String channel = list.get(position);
        position++;
        return channel;
    }
}
