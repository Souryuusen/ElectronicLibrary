package com.elibrary.entities.data;

import java.io.Serializable;
import java.util.Objects;

public class LibraryElement extends AbstractElement implements Serializable{

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

    public LibraryElement(String title, long creatorID, long contentID, boolean contentPending, boolean contentRestricted) {
        setTitle(title);
        this.creatorID = creatorID;
        this.contentID = contentID;
        this.contentPending = contentPending;
        this.contentRestricted = contentRestricted;
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
        StringBuilder sb = new StringBuilder();
        sb.append("<LibraryElement>\n\t")
                .append("<Title>\t").append(getTitle()).append("\t</Title>\n\t")
                .append("<Content-ID>\t").append(getContentID()).append("\t</Content-ID>\n\t")
                .append("<Creator>\t").append(getCreatorID()).append("\t</Creator>\n\t")
                .append("<Pending>\t").append(isContentPending()).append("\t</Pending>\n\t")
                .append("<Restricted>\t").append(isContentRestricted()).append("\t</Restricted>\n")
                .append("</LibraryElement>");
        return sb.toString();
    }

    @Override
    public String convertToYAML() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        LibraryElement e = (LibraryElement) obj;
        return getTitle().equalsIgnoreCase(e.getTitle()) && contentID == e.getContentID()
                && creatorID == e.getCreatorID() && contentPending == e.isContentPending()
                && contentRestricted == e.contentRestricted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTitle()).append(" [").append(getContentID()).append(",").append(getCreatorID()).append("]");
        if(isContentPending()) {
            sb.append(" - Content Pending Approval");
        }
        if(isContentRestricted()) {
            sb.append(" - Content Marked As Restricted");
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), contentID, creatorID, contentPending, contentRestricted);
    }
}
