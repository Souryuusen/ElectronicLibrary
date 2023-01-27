package com.entities.data;

import com.elibrary.entities.data.BookElement;
import com.elibrary.entities.data.LibraryElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.print.Book;

public class BookElementTest {

    @DisplayName("toString Without Data Test")
    @Test
    public void toStringNoDataTest() {
        BookElement be = new BookElement();
        // Default Constructor Test
        assertEquals("Brak danych książki.", be.toString());
    }

    @DisplayName("toString With Data Test")
    @Test
    public void toStringWithDataTest() {
        // Parametrized Constructor Test
        BookElement be = new BookElement("J.R.R Tolkien", "Hobbit", "To Jest Opis...", false);
        String testString = "J.R.R Tolkien, Hobbit\nTo Jest Opis...";
        assertEquals(be.toString(), testString);
    }

    @DisplayName("equals Method Test")
    @Test
    public void equalsTest() {
        BookElement b1 = new BookElement();
        BookElement b2 = new BookElement();
        // Default Constructor Objects Equals
        assertEquals(b1, b2);
        // Default Constructor Vs Parametrized Constructor Object Equals
        b1 = new BookElement("J.R.R Tolkien", "Hobbit", "To Jest Opis...", false);
        assertNotEquals(b1, b2);
        // Parametrized Constructors Object Equals
        b2 = new BookElement("J.R.R Tolkien", "Hobbit", "To Jest Opis...", false);
        assertEquals(b1, b2);
        // Different Type Objects Object Equals
        LibraryElement l1 = new LibraryElement();
        assertNotEquals(b1, l1);
        // Null Value Object Equals
        b2 = null;
        assertNotEquals(b1, b2);
        // Different Author Object Equals
        b2 = new BookElement("R.J.R Tlkin", "Hobbit", "To Jest Opis...", false);
        assertNotEquals(b1, b2);
        // Different Titles Object Equals
        b2 = new BookElement("J.R.R Tolkien", "Silmarilion", "To Jest Opis...", false);
        assertNotEquals(b1, b2);
        // Different Descriptions Object Equals
        b2 = new BookElement("J.R.R Tolkien", "Hobbit", "Different Description", false);
        assertNotEquals(b1, b2);
        // Same Creator ID Object Equals
        b2 = new BookElement("J.R.R Tolkien", "Hobbit", "To Jest Opis...", false);
        b1.setCreatorID(1234);
        b2.setCreatorID(1234);
        assertEquals(b1, b2);
        // Different Creator ID Object Equals
        b2.setCreatorID(4321);
        assertEquals(b1, b2);
        // Same Content ID Object Equals
        b1.setContentID(1001);
        b2.setContentID(1001);
        b2.setCreatorID(1234);
        assertEquals(b1, b2);
        // Different Contnet ID Object Equals
        b2.setContentID(2002);
        assertNotEquals(b1,b2);
    }


}
