package com.lyw.cloud.lyw.oauth2.domain;

import lombok.Data;

/**
 * @Author: luohx
 * @Date: 2020/8/7 9:16
 * @Version: 1.0
 */
@Data
public class JWT {
    private String access_token;
    private String token_type;
    private String refresh_token;
    private String scope;
    private String jti;
    private int expires_in;
}
