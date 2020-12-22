package com.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidation validation = new UserValidation();
        boolean result = validation.ValidateFirstName("Uthsavi");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        UserValidation validation = new UserValidation();
        boolean result = validation.ValidateFirstName("uth");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidation validation = new UserValidation();
        boolean result = validation.ValidateLastName("Gowda");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserValidation validation = new UserValidation();
        boolean result = validation.ValidateLastName("go");
        Assert.assertFalse(result);
    }
    @Test
    public void givenEmailAddress_WhenProper_ShouldReturnTrue() {
        UserValidation validation = new UserValidation();
        boolean result = validation.ValidateEmailAddress("uthsavi29@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() {
        UserValidation validation = new UserValidation();
        boolean result = validation.ValidateEmailAddress("uthsavi@com");
        Assert.assertFalse(result);
    }
}