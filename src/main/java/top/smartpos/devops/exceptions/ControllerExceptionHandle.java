package top.smartpos.devops.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.smartpos.devops.beans.protocol.Result;
import top.smartpos.devops.enums.ResultEnum;
import top.smartpos.devops.utils.LogUtils;
import top.smartpos.devops.utils.ResultUtils;

@RestControllerAdvice
/**
 * 捕获所有controller中抛出的异常
 */
public class ControllerExceptionHandle {
    @ExceptionHandler(value = Throwable.class)
    public Result handle(Throwable e) {
        if (e instanceof ApiException) {//自己封装的异常，为已知异常，异常内容正常返回前端
            ApiException apiException = (ApiException) e;
            return ResultUtils.error(apiException.getResultEnum());
        }
        //未知异常打印日志，返回前端为未知异常枚举
        LogUtils.error(e.getMessage(), e);
        return ResultUtils.error(ResultEnum.UNKOWN_ERROR);
    }
}
