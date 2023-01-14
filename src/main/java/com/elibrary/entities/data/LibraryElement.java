package com.elibrary.entities.data;

import java.io.Serializable;

public class LibraryElement implements Serializable, Cloneable {

    private String title;

    protected LibraryElement() {

    }

    protected LibraryElement(LibraryElement element) {
        this.title = element.getTitle();
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Object) new LibraryElement(this);
    }
}
