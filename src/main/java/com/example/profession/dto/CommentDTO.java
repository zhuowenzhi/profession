package com.example.profession.dto;

import com.example.profession.model.User;
import lombok.Data;

/**
 * @author : zwz
 * @date : 2020/3/5 0005
 */
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
    public void setUser(User user) {
        this.user = user;
    }
}
