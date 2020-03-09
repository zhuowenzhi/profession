package com.example.profession.enums;

/**
 * @author : zwz
 * @date : 2020/3/7 0007
 */
public enum  NotificationStatusEnum {
    UNREAD(0), READ(1);
    private int status;

    NotificationStatusEnum(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
