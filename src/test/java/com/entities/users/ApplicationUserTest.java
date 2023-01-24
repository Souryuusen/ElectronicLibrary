package com.entities.users;

import com.elibrary.entities.users.ApplicationUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ApplicationUserTest {

    private ApplicationUser au;

    @BeforeEach
    public void initTests() {
        au = new ApplicationUser();
    }

    @Test
    public void getRegistrationDateTest() {
        LocalDateTime date = LocalDateTime.of(2022, 1, 14, 13, 0);
        au.setRegistrationDate(date);
        // Verification Of Set Date Not Being NULL
        Assertions.assertNotNull(au.getRegistrationDate());
        // Verification Of Proper Date Is Being Returned
        Assertions.assertEquals(au.getRegistrationDate(), date);
    }


}
