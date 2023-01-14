package com.elibrary.entities.users;

import com.elibrary.entities.states.UserRoles;

import java.io.Serializable;

abstract class AbstractUser implements Serializable {

    private boolean banned;

    private UserRoles userRole;
    private long userID;

    private String username;
    private String passwordHash;

    public long getUserID() {
        return this.userID;
    }

    public String getUsername() {
        return this.username;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return this.passwordHash;
    }

    private void setPasswordHash(String passwordHash) {

    }

    public UserRoles getUserRole() {
        return this.userRole;
    }

    protected void setUserID(UserRoles userRole) {
        this.userRole = userRole;
    }

    public boolean isBanned() {
        return this.banned;
    }

    protected void setBanned(boolean banned) {
        this.banned = banned;
    }

    abstract String verifyUser(String username, String passwordHash);
}
