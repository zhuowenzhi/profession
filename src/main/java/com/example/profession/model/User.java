package com.example.profession.model;

import lombok.Data;

/**
 * @author : zwz
 * @date : 2020/2/21
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
