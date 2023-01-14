package com.elibrary.entities.users;

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
    String verifyUser(String username, String passwordHash) {
        return null;
    }
}
