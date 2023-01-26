package com.elibrary.entities.data;

import java.io.Serializable;
import java.util.Objects;

public class BookElement extends LibraryElement implements Serializable, Cloneable {

    private String author;
    private String synopsis;

    private boolean partOfSeries;

    public BookElement() {
        super();
        this.author = "";
        this.synopsis = "";
        this.partOfSeries = false;
    }

    public BookElement(BookElement element) {
        this.setTitle(element.getTitle());
        this.author = element.getAuthor();
        this.synopsis = element.getSynopsis();
        this.setPartOfSeries(element.isPartOfSeries());
    }

    public BookElement(String author, String title, String synopsis, boolean partOfSeries) {
        super(title);
        this.author = author;
        this.synopsis = synopsis;
        this.partOfSeries = partOfSeries;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
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
        if(!author.equals("") && !getTitle().equals("") && !synopsis.equals("")) {
            return author + ", " + getTitle() + "\n" + synopsis;
        } else {
            return "Brak danych książki.";
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Object) new BookElement(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookElement that = (BookElement) o;
        return partOfSeries == that.partOfSeries && Objects.equals(author, that.author) && Objects.equals(synopsis, that.synopsis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, synopsis, partOfSeries);
    }
}