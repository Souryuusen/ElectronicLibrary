package com.elibrary.entities.users;

import com.elibrary.entities.states.UserRoles;

import java.time.LocalDateTime;

public class ApplicationUser extends AbstractUser {

    private long collectedElementsCount;

    private LocalDateTime registrationDate;

    public LocalDateTime getRegistrationDate() {
        return this.registrationDate;
    }

    public ApplicationUser() {
        super();
        this.collectedElementsCount = 0;
        this.registrationDate = null;
    }

    public ApplicationUser(String username, String passwordHash) {
        super(username, passwordHash);
        this.collectedElementsCount = 0;
        this.registrationDate = null;
    }

    public ApplicationUser(String username, String passwordHash, long userID, UserRoles userRoles,
                           long collectedElementsCount, LocalDateTime registrationDate) {
        super(username, passwordHash, userID, userRoles, false);
        this.collectedElementsCount = collectedElementsCount;
        this.registrationDate = LocalDateTime.of(registrationDate.toLocalDate(), registrationDate.toLocalTime());
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = LocalDateTime.of(registrationDate.toLocalDate(), registrationDate.toLocalTime());
    }

    public long getCollectedElementsCount() {
        return this.collectedElementsCount;
    }

    protected void setCollectedElementsCount(long collectedElementsCount) {
        this.collectedElementsCount = collectedElementsCount;
    }

    public void increaseCollectedElementsCount() {
        this.collectedElementsCount++;
    }


    // TODO: Create verifyUser Procedure After Creating DAO Classes
    @Override
    public String verifyUser(String username, String passwordHash) {
        return null;
    }
}
