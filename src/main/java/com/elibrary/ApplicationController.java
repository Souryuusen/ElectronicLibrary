package com.elibrary;

import com.elibrary.entities.users.ApplicationUser;

public class ApplicationController {

    private ApplicationUser currentUser;
    private ApplicationView applicationView;

    public static ApplicationController instance;

    private ApplicationController() {
        applicationView = ApplicationView.getInstance();
    }

    public static ApplicationController getInstance() {
        if(instance == null) {
            instance = new ApplicationController();
        }
        return instance;
    }

    public void loginUser(String user, String passwordHash) {
        throw new UnsupportedOperationException();
    }
}
