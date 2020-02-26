package com.example.profession.dto;

import lombok.Data;

/**
 * @author : zwz
 * @date : 2020/2/20
 */

@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
