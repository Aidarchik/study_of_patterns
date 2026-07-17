package iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ChannelTest {
    @Test
    void shouldIterateOverChannels() {
        ChannelCollection collection = new ChannelCollection();
        collection.addChannel("Первый канал");
        collection.addChannel("Россия 1");

        MyIterator iterator = collection.createIterator();

        int count = 0;

        while (iterator.hasNext()) {
            String channel = iterator.next();
            assertNotNull(channel);
            count++;
        }

        assertEquals(2, count);
    }
}
