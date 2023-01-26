package com.elibrary.entities.users;

import com.elibrary.entities.data.LibraryElement;
import com.elibrary.entities.states.ContentEditResults;
import com.elibrary.entities.states.UserRegisterResults;
import com.elibrary.entities.states.UserRoles;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ApplicationAdmin extends ContentEditor{

    public ApplicationAdmin() {
        super();
    }

    public ApplicationAdmin(String username, String passwordHash, long userID, UserRoles userRoles,
                            long collectedElementsCount, LocalDateTime registrationDate, long editedCount) {
        super(username, passwordHash, userID, userRoles, collectedElementsCount, registrationDate, editedCount, false);
    }

    public ArrayList<LibraryElement> getReportedContent() {
        return null;
    }

    public ContentEditResults removeContent(LibraryElement element) {
        return null;
    }

    public void grantUserRole(AbstractUser user, UserRoles role) {
        throw new UnsupportedClassVersionError();
    }

    public UserRegisterResults addUser(AbstractUser user) {
        return null;
    }

    public void removeUser(long uui) {
        throw new UnsupportedOperationException();
    }

    public void banUser(long uuid, String reason) {
        throw new UnsupportedOperationException();
    }

}
