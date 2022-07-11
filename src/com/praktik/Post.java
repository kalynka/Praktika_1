package com.praktik;

public class Post {
    private String title;
    private String author;
    private String dateOfCreated;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDateOfCreated() {
        return dateOfCreated;
    }
    public void setDateOfCreated(String dateOfCreated) {
        this.dateOfCreated = dateOfCreated;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", dateOfCreated='" + dateOfCreated + '\'' +
                '}';
    }
}
