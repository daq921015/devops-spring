package top.smartpos.devops.beans.protocol;


/**
 * 响应请求最外层封装对象（传递给前端）
 * 返回信息示例：
 * 成功：{"code":0,"msg":"success",data:obj}
 * 失败：{"code":err_code,"msg":err_msg,data:null}
 *
 * @param <T>
 */
public class Result<T> {
    /**
     * 错误码。
     */
    private Integer code;
    /**
     * 提示信息.
     */
    private String msg;
    /**
     * 具体的内容。
     */
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
