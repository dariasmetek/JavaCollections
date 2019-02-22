package model;

import java.time.LocalDateTime;

public class Message {
    String content;
    String author;
    LocalDateTime dateTime;

    public Message(String content, String author) {
        this.content = content;
        this.author = author;
        this.dateTime = LocalDateTime.now();

    }
    @Override
    public String toString() {
        return "Wiadomosc od:" + author + "odebrana: " + dateTime + "o tresci: " + content;

    }

    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }




}
