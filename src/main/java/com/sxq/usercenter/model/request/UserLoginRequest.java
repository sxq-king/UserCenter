package com.sxq.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: s x q
 * @Date: 2022/8/22 18:11
 * @Version: v1.0
 */

@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -4109135923385156696L;

    private String userAccount;
    private String userPassword;

}
