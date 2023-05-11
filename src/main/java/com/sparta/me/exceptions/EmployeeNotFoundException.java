package com.sparta.me.exceptions;

public class EmployeeNotFoundException extends Exception {

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public EmployeeNotFoundException(String message) {
        super(message);
    }

}
