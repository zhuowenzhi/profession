package com.example.profession.dto;

import com.example.profession.exception.CustomizeException;
import lombok.Data;

import java.util.List;

/**
 * @author : zwz
 * @date : 2020/2/28 0028
 */
@Data
public class ResultDTO<T>{
    private Integer code;
    private String message;
    private T data;

    public static ResultDTO errorOf(Integer code, String message) {
        ResultDTO resultDTO = new ResultDTO(code, message);
        return resultDTO;
    }

    public static ResultDTO okOf() {
        ResultDTO resultDTO = new ResultDTO(200, "请求成功");
        return resultDTO;
    }

    public static <T> ResultDTO okOf(T t) {
        ResultDTO resultDTO = new ResultDTO(200, "请求成功");
        resultDTO.setData(t);
        return resultDTO;
    }

    public ResultDTO(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultDTO() {}

    public static ResultDTO errorOf(CustomizeException e) {
        return errorOf(e.getCode(),e.getMessage());
    }
}
