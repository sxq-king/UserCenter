package com.sxq.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: s x q
 * @Date: 2022/8/22 17:57
 * @Version: v1.0
 * 用户注册请求体
 */

@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -9093761450737932142L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;
}
