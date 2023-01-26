package com.elibrary;

public class ApplicationModel {

    public static ApplicationModel instance;

    private ApplicationModel() {

    }

    public static ApplicationModel getInstance() {
        if(instance == null) {
            instance = new ApplicationModel();
        }
        return instance;
    }

}
