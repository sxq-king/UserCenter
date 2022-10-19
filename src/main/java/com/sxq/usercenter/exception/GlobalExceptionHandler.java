package com.sxq.usercenter.exception;

import com.sxq.usercenter.common.BaseResponse;
import com.sxq.usercenter.common.ErrorCode;
import com.sxq.usercenter.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Auther: s x q
 * @Date: 2022/9/17 21:33
 * @Version: v1.0
 *
 * 全局异常处理器(AOP调用方法前后进行额外处理)
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse businessExceptionHandler(BusinessException e){
        log.error("BusinessException:"+e.getMessage(),e );
        return ResultUtils.error(e.getCode(), e.getMessage(),e.getDescription());
    }
    @ExceptionHandler(RuntimeException.class)
    public BaseResponse runtimeExceptionHandler(RuntimeException e){
        log.error("runtimeException",e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, e.getMessage(),"");
    }

}
