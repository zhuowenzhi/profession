package com.example.profession.model;

import lombok.Data;

/**
 * @author : zwz
 * @date : 2020/2/24 0024
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tags;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;

}
