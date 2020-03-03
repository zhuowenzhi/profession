package com.example.profession.enums;

/**
 * @author : zwz
 * @date : 2020/3/3 0003
 */
public enum  CommentTypeEum {
    QUESTION(1),
    COMMENT(2)
    ;
    private Integer type;

    CommentTypeEum(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public static boolean isExist(Integer type) {
        for (CommentTypeEum commentTypeEum : CommentTypeEum.values()) {
            if (commentTypeEum.getType() == type) {
                return true;
            }
        }
        return false;
    }
}
