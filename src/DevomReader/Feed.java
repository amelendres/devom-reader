package DevomReader;

import java.lang.reflect.Array;

public class Feed {
    private int day;
    private String title,content,passageText,passageReference;

    Feed(int Day,String title,String Content, String PassageText, String PassageReference){
        this.day=Day;
        this.title=title;
        this.content=Content;
        this.passageText=PassageText;
        this.passageReference=PassageReference;
    }

}
