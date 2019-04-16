package com.iscloud.demo.Exceptions;

public class propertiesException extends Exception {
    public static String NOT_FOUND = "PROPERTY NOT FOUND";
    public static String ALREADY_EXISTS="THE PROPERTY ALREADY EXISTS";

    public propertiesException(String message){
        super(message);

    }
}
