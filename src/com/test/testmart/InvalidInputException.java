package com.test.testmart;


/**
 * Created by CMI-USER on 2/23/2016.
 */
public class InvalidInputException extends Exception {

    private String errorDetails;

    public InvalidInputException(String reason, String errorDetails){
        super(reason);
        this.errorDetails = errorDetails;
    }

    public String getFaultInfo(){
        return errorDetails;
    }
}
