package com.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidation validation = new UserValidation();
        boolean result = validation.ValidFirstName("Uthsavi");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        UserValidation validation = new UserValidation();
        boolean result = validation.ValidFirstName("uth");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidation validation = new UserValidation();
        boolean result = validation.ValidLastName("Gowda");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserValidation validation = new UserValidation();
        boolean result = validation.ValidLastName("go");
        Assert.assertFalse(result);
    }
}