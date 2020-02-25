package be.ehb.notedroid.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Note implements Serializable {

    private String Title;
    private String content;
    private LocalDate Date;

    public Note(String title, String content, LocalDate date) {
        Title = title;
        this.content = content;
        Date = date;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }
}
