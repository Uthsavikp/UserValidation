package com.uservalidation;

import java.util.regex.Pattern;

public class UserValidation {
    private static final String Name = "^[A-Z][a-zA-Z]{2,}$";

    public boolean ValidFirstName(String firstName){
        Pattern pattern = Pattern.compile(Name);
        return pattern.matcher(firstName).matches();
    }
}

