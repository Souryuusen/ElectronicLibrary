package com.elibrary.entities.data;

import java.io.Serializable;

public class LibraryElement extends AbstractElement implements Serializable, Cloneable {

    private long contentID;
    private long creatorID;

    private boolean contentRestricted;
    private boolean contentPending;

    public LibraryElement() {
        setTitle("");
        this.contentPending = false;
        this.contentRestricted = false;
        this.contentID = 0;
        this.creatorID = 0;
    }

    public LibraryElement(LibraryElement element) {
       setTitle(element.getTitle());
       setContentID(element.getContentID());
       setCreatorID(element.getCreatorID());
       setContentPending(element.isContentPending());
       setContentRestricted(element.isContentRestricted());
    }

    public LibraryElement(String title) {
        setTitle(title);
    }

    public long getContentID() {
        return contentID;
    }

    public void setContentID(long contentID) {
        this.contentID = contentID;
    }

    public long getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(long creatorID) {
        this.creatorID = creatorID;
    }

    public boolean isContentRestricted() {
        return contentRestricted;
    }

    public void setContentRestricted(boolean contentRestricted) {
        this.contentRestricted = contentRestricted;
    }

    public boolean isContentPending() {
        return contentPending;
    }

    public void setContentPending(boolean contentPending) {
        this.contentPending = contentPending;
    }

    @Override
    public String convertToJSON() {
        return null;
    }

    @Override
    public String convertToXML() {
        return null;
    }

    @Override
    public String convertToYAML() {
        return null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Object) new LibraryElement(this);
    }
}
