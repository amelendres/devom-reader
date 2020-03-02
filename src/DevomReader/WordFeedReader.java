package DevomReader;

import java.util.ArrayList;

public class WordFeedReader implements FeedReader{

    @Override
    public ArrayList<Feed> feeds() {
        //file read


        //file parsed
        ArrayList<Feed> feeds= new ArrayList<>();
        //...

        feeds.add(new Feed(1, "asds","wer","hello","(salmo 1:1)"));

        return  feeds;
    }
}
