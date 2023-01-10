package com.elibrary.book;

public class BookElement extends LibraryElement{

    private String author;
    private String synopsis;

    private boolean partOfSeries;

    public BookElement() {
        super();
    }

    public BookElement(String author, String synopsis, boolean partOfSeries) {
        super();
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
        partOfSeries = partOfSeries;
    }
}
