package com.elibrary.entities.users;

import com.elibrary.entities.data.LibraryElement;
import com.elibrary.entities.states.ContentEditResults;
import com.elibrary.entities.states.UserRoles;

import java.time.LocalDateTime;

public class ContentEditor extends ApplicationUser {

    private long editedCount;

    private boolean onTestPeriod;

    public ContentEditor() {
        super();
        this.editedCount = 0;
        this.onTestPeriod = false;
    }

    public ContentEditor(String username, String passwordHash, long userID, UserRoles userRoles,
                           long collectedElementsCount, LocalDateTime registrationDate, long editedCount,
                            boolean onTestPeriod) {
        super(username, passwordHash, userID, userRoles, collectedElementsCount, registrationDate);
        this.editedCount = editedCount;
        this.onTestPeriod = onTestPeriod;
    }

    public long getEditedCount() {
        return editedCount;
    }

    public void setEditedCount(long editedCount) {
        this.editedCount = editedCount;
    }

    public boolean isOnTestPeriod() {
        return onTestPeriod;
    }

    public void setOnTestPeriod(boolean onTestPeriod) {
        this.onTestPeriod = onTestPeriod;
    }

    protected boolean verifyTestPeriod() {
        return false;
    }

    public ContentEditResults approveContent(LibraryElement element) {
        return null;
    }

    public ContentEditResults reportContent(LibraryElement element) {
        return null;
    }

}
