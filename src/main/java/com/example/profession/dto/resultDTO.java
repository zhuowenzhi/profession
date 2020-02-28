package com.example.profession.dto;

import lombok.Data;

/**
 * @author : zwz
 * @date : 2020/2/28 0028
 */
@Data
public class resultDTO<T> {
    private Integer code;
    private String message;
    private T data;
}
