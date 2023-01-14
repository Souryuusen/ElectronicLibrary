package com.elibrary.entities.users;

import java.time.LocalDateTime;

public class ApplicationUser extends AbstractUser {

    private long collectedElementsCount;

    private LocalDateTime registrationDate;

    public LocalDateTime getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = LocalDateTime.of(registrationDate.toLocalDate(), registrationDate.toLocalTime());
    }


    // TODO: Create verifyUser Procedure After Creating DAO Classes
    @Override
    String verifyUser(String username, String passwordHash) {
        return null;
    }
}
