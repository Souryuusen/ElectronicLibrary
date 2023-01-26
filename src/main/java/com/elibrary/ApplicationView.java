package com.elibrary;

public class ApplicationView {

    public static ApplicationView instance;

    private ApplicationView() {

    }

    public static ApplicationView getInstance() {
        if(instance == null) {
            instance = new ApplicationView();
        }
        return instance;
    }

}
