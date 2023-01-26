package com.entities.data;

import com.elibrary.entities.data.LibraryElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("LibraryElement Class Test")
public class LibraryElementTest {

    @DisplayName("Default Constructor Fields State Test")
    @Test
    public void defaultConstructorTest() {
        LibraryElement element = new LibraryElement();
        // Element Creation
        assertNotNull(element);
        // Values Of All Number Fields Should Be 0
        assertEquals(element.getContentID(), 0);
        assertEquals(element.getCreatorID(),0);
        // Title After Default Constructor Should Be ""
        assertEquals(element.getTitle(),"");
        // Values Of All Boolean Fields Should Be False
        assertFalse(element.isContentPending());
        assertFalse(element.isContentRestricted());
    }

    @DisplayName("Equals Method Proper Behaviour Test")
    @Test
    public void objectEqualsTest() {
        LibraryElement e1 = new LibraryElement("Test 1", 1, 1, false, false);
        LibraryElement e2 = new LibraryElement("Test 1", 1, 1, false, false);
        assertEquals(e1, e2);
        e2 = new LibraryElement("Test 2", 2, 2, false, false);
        assertNotEquals(e1, e2);
        e2 = new LibraryElement("Test 1", 1, 1, false, true);
        assertNotEquals(e1, e2);
        e2 = new LibraryElement("Test 1", 1, 1, true, false);
        assertNotEquals(e1, e2);
        e2 = new LibraryElement("Test 1", 1, 2, false, false);
        assertNotEquals(e1, e2);
        e2 = new LibraryElement("Test 1", 2, 1, false, false);
        assertNotEquals(e1, e2);
        e2 = new LibraryElement("Test 2", 1, 1, false, false);
        assertNotEquals(e1, e2);
    }

    @DisplayName("toString Method Test")
    @Test
    public void toStringTest() {
        LibraryElement element = new LibraryElement("Test Title", 1, 102, true, false);
        String expected = "Test Title [102,1] - Content Pending Approval";
        assertTrue(expected.equals(element.toString()));
        expected = "Test Title [1,102]";
        assertFalse(expected.equals(element.toString()));
        element = new LibraryElement("Test Title", 102, 1, false, false);
        expected = "Test Title [1,102]";
        assertTrue(expected.equals(element.toString()));
        expected = "Test Title [102,1] - Content Pending Approval";
        assertFalse(expected.equals(element.toString()));
        element = new LibraryElement("Test Title", 102, 1, false, true);
        expected = "Test Title [1,102] - Content Marked As Restricted";
        assertTrue(expected.equals(element.toString()));
        expected = "Test Title [1,102]";
        assertFalse(expected.equals(element.toString()));
    }

    @DisplayName("Library Element To XML Conversion Test")
    @Test
    public void convertToXMLTest() {
        LibraryElement e = new LibraryElement("Library Test Element", 1001, 2, false, false);

        String expected = "<LibraryElement>\n" +
                                "\t<Title>\t" + "Library Test Element" + "\t</Title>\n" +
                                "\t<Content-ID>\t" + 2 + "\t</Content-ID>\n" +
                                "\t<Creator>\t" + 1001 + "\t</Creator>\n" +
                                "\t<Pending>\t" + false + "\t</Pending>\n" +
                                "\t<Restricted>\t" + false + "\t</Restricted>\n" +
                            "</LibraryElement>";
        assertTrue(e.convertToXML().equals(expected));

    }


}
