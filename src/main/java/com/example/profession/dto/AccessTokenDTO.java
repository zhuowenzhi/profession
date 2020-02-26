package com.example.profession.dto;

import lombok.Data;

/**
 * @author: zwz
 * @date : 2020/2/20
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private  String client_secret;
    private String code;
    private  String redirect_uri;
    private String state;
}
