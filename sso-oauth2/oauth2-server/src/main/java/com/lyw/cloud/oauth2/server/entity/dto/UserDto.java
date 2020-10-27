package com.lyw.cloud.oauth2.server.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: luohx
 * @Description: 描述
 * @Date: 2020/10/27 10:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto  implements Serializable {
    /** 用户Id**/
    private int id;

    /** 用户名**/
    private String username;

    /** 用户密码**/
    private String password;

    /** 手机号**/
    private String phone;

    /** 性别**/
    private String sex;

    /** 邮件**/
    private String email;

    /** 备注**/
    private String mark;

    /** 用户级别**/
    private String rank;

    /** 最后一次时间**/
    private Date lastLogin;

    /** 登录ip**/
    private String loginIp;

    /** 图片路径**/
    private String imageUrl;

    /** 注册时间**/
    private Date regTime;

    /** 账号是否被锁定**/
    private Boolean locked = Boolean.FALSE;

    /** 权限**/
    private String rights;
}
