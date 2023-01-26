package com.elibrary.entities.data;

import java.io.Serializable;

public class LibraryElement extends AbstractElement implements Serializable, Cloneable {



    protected LibraryElement() {

    }

    protected LibraryElement(LibraryElement element) {
       setTitle(element.getTitle());
    }

    protected LibraryElement(String title) {
        setTitle(title);
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
