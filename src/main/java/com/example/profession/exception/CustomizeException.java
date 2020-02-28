package com.example.profession.exception;

/**
 * @author : zwz
 * @date : 2020/2/28 0028
 */
public class CustomizeException  extends RuntimeException{
    private String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.message = errorCode.getMessage();
    }
    public CustomizeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
