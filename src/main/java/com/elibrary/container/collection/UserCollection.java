package com.elibrary.container.collection;

import com.elibrary.container.shelf.ElementShelf;

import java.util.ArrayList;

public class UserCollection {

    private ArrayList<ElementShelf> userCollection;

    public UserCollection() {
        this.userCollection = new ArrayList<>();
    }

    public UserCollection(ArrayList<ElementShelf> userCollection) {
        this.userCollection = new ArrayList<>(userCollection);
    }

    public ArrayList<ElementShelf> getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(ArrayList<ElementShelf> userCollection) {
        this.userCollection = userCollection;
    }
}
