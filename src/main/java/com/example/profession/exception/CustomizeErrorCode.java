package com.example.profession.exception;

/**
 * @author : zwz
 * @date : 2020/2/28 0028
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode{

    QUESTION_NOT_FOUND("你找到问题不在了，要不要换个试试？");
    private String message;


    CustomizeErrorCode(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
