package com.elibrary.book;

public class LibraryElement {

    private String title;

    protected LibraryElement() {

    }

    protected LibraryElement(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
