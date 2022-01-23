package com.example.googlelogin.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class UserToken {
    private String access_token;
    private int expires_in;
    private String scope;
    private String token_type;
    private String token_id;
}
