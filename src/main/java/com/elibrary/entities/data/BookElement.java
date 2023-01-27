package com.elibrary.entities.data;

import java.io.Serializable;
import java.util.Objects;

public class BookElement extends LibraryElement implements Serializable, Cloneable {

    private String bookAuthor;
    private String description;

    private boolean partOfSeries;

    public BookElement() {
        super();
        this.bookAuthor = "";
        this.description = "";
        this.partOfSeries = false;
    }

    public BookElement(BookElement element) {
        this.setTitle(element.getTitle());
        this.bookAuthor = element.getBookAuthor();
        this.description = element.getDescription();
        this.setPartOfSeries(element.isPartOfSeries());
    }

    public BookElement(String bookAuthor, String title, String description, boolean partOfSeries) {
        super(title);
        this.bookAuthor = bookAuthor;
        this.description = description;
        this.partOfSeries = partOfSeries;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPartOfSeries() {
        return partOfSeries;
    }

    public void setPartOfSeries(boolean partOfSeries) {
        this.partOfSeries = partOfSeries;
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
    public String toString() {
        if(!bookAuthor.equals("") && !getTitle().equals("") && !description.equals("")) {
            return bookAuthor + ", " + getTitle() + "\n" + description;
        } else {
            return "Brak danych książki.";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookElement that = (BookElement) o;
        return partOfSeries == that.partOfSeries && Objects.equals(bookAuthor, that.bookAuthor) && Objects.equals(description, that.description)
                && Objects.equals(getTitle(), that.getTitle()) && Objects.equals(getContentID(), that.getContentID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookAuthor, description, partOfSeries);
    }
}