package ggikko.me.recyclerviewtest.recyclerview;

/**
 * Created by ggikko on 16. 4. 2..
 */
public class Write {

    private String title, subTitle, writer;

    public Write(String title, String subTitle, String writer) {
        this.title = title;
        this.subTitle = subTitle;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
