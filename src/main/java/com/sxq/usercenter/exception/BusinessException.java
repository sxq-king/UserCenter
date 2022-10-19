package com.sxq.usercenter.exception;

import com.sxq.usercenter.common.ErrorCode;

/**
 * @Auther: s x q
 * @Date: 2022/9/17 21:16
 * @Version: v1.0
 *
 * 全局异常处理
 */

public class BusinessException extends RuntimeException{

    private final int code;
    private final String description;

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode,String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }
}
