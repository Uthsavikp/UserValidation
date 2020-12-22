package com.uservalidation;

import java.util.regex.Pattern;

public class UserValidation {
    private static final String NAME_PATTERN = "[A-Z][a-zA-Z]{2,}";
    private static final String EMAIL_PATTERN = "[a-zA-z]{3}[0-9a-zA-Z\\.\\_\\-\\+]*@[a-z0-9]*\\.(co|com.au|in|net|in|com.com|com|)";
    private static final String MOBILE_PATTERN = "(\\+91)[6-9][0-9]{9}";

    public boolean ValidateFirstName(String firstName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    public boolean ValidateLastName(String lastName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
    public boolean ValidateEmailAddress(String emailAddress){
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(emailAddress).matches();
    }
    public boolean ValidateMobileNumber(String mobileNumber){
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        return pattern.matcher(mobileNumber).matches();
    }
}

