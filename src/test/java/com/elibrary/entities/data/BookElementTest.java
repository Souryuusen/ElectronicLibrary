package com.elibrary.entities.data;

import com.elibrary.entities.data.BookElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookElementTest {

    @Test
    public void toStringNoDataTest() {
        BookElement be = new BookElement();
        // Default Constructor Test
        Assertions.assertEquals("Brak danych książki.", be.toString());
    }

    @Test
    public void toStringWithDataTest() {
        // Parametrized Constructor Test
        BookElement be = new BookElement("J.R.R Tolkien", "Hobbit", "To Jest Opis...", false);
        String testString = "J.R.R Tolkien, Hobbit\nTo Jest Opis...";
        Assertions.assertEquals(be.toString(), testString);
    }

    @Test
    public void cloneTest() {
        BookElement be = new BookElement("J.R.R Tolkien", "Hobbit", "To Jest Opis...", false);
        try {
            BookElement newBook = (BookElement) be.clone();
            Assertions.assertNotSame(be, newBook);
            Assertions.assertEquals(newBook, be);
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
    }

}
