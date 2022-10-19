package com.sxq.usercenter.common;

/**
 *
 * 错误码
 *
 * @Auther: s x q
 * @Date: 2022/9/17 19:47
 * @Version: v1.0
 */

public enum ErrorCode {
    SUCCESS(0,"ok",""),
    PARAMS_ERROR(40000,"请求参数错误",""),
    NULL_ERROR(40001,"数据为空",""),
    NO_AUTH(40101,"无权限",""),
    NO_LOGIN(40100,"未登录",""),
    SYSTEM_ERROR(50000,"系统内部异常","")
    ;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }

    /**
     * 状态码
     */
    private final int code;
    /**
     * 状态码信息
     */
    private final String message;
    /**
     * 错误详情
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }
}
