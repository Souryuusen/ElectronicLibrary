package com.elibrary.entities.users;

import com.elibrary.entities.states.UserRoles;

import java.io.Serializable;

abstract class AbstractUser implements Serializable {

    private boolean banned;

    private UserRoles userRole;
    private long userID;

    private String username;
    private String passwordHash;

    protected AbstractUser() {
        this.banned = false;
        this.userRole = UserRoles.NO_ROLE;
        this.userID = 0;
        this.username = "";
        this.passwordHash = "";
    }

    protected AbstractUser(String username, String passwordHash) {
        this();
        this.username = username;
        this.passwordHash = passwordHash;
    }

    protected AbstractUser(String username, String passwordHash, UserRoles userRole) {
        this(username, passwordHash);
        this.userRole = userRole;
    }

    protected AbstractUser(String username, String passwordHash, long userID) {
        this(username, passwordHash);
        this.userID = userID;
    }

    protected AbstractUser(String username, String passwordHash, long userID, UserRoles userRole, boolean banned) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.userID = userID;
        this.userRole = userRole;
        this.banned = banned;
    }

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
