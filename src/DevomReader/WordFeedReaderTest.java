package DevomReader;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WordFeedReaderTest {


    @Test
    void readFeeds() {
        WordFeedReader reader = new WordFeedReader();
        ArrayList<Feed> feeds = reader.feeds();

        assertEquals(1, feeds.size());
    }
}