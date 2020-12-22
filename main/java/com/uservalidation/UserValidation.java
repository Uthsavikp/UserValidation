package com.uservalidation;

import java.util.regex.Pattern;

public class UserValidation {
    private static final String NAME_PATTERN = "[A-Z][a-zA-Z]{2,}";

    public boolean ValidFirstName(String firstName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
    public boolean ValidLastName(String lastName){
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }
}

