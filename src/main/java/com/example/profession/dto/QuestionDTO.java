package com.example.profession.dto;

import com.example.profession.model.User;
import lombok.Data;

/**
 * @author : zwz
 * @date : 2020/2/26 0026
 */
@Data
public class QuestionDTO {
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
    private User user;
}
