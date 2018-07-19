package top.smartpos.devops.beans.domains.haiding;

import io.swagger.annotations.ApiModelProperty;

public class ResultHaiDingDomain {
    @ApiModelProperty("是否成功(为 true 时，statusCode 为 0)")
    private String success;
    @ApiModelProperty("状态码(0 表示成功，非 0 表示失败)")
    private String statusCode;
    @ApiModelProperty("消息(成功或者失败的提示信息)")
    private String message;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
