package com.example.profession.dto;

import lombok.Data;

/**
 * @author : zwz
 * @date : 2020/3/3 0003
 */
@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
