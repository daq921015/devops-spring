package top.smartpos.devops.beans.domains.baoli.result;

import io.swagger.annotations.ApiModelProperty;
import top.smartpos.devops.beans.domains.baoli.AccountReduceDomain;
import top.smartpos.devops.beans.domains.baoli.VipDomain;

public class ResultAccountReduceDomain {
    @ApiModelProperty("请求是否成功T 代表成功,F 代表失败")
    private String is_success;
    @ApiModelProperty("签名方式,暂仅支持MD5")
    private String sing_type;
    @ApiModelProperty("签名")
    private String sign;
    @ApiModelProperty("业务参数,描述业务的具体信息，json格式")
    private BusinessData data;

    private class BusinessData {
        @ApiModelProperty("业务接口返回的状态码")
        private String result_code;
        @ApiModelProperty("业务接口返回的提示信息")
        private String info;
        @ApiModelProperty("具体业务数据")
        private AccountReduceDomain data;

        public String getResult_code() {
            return result_code;
        }

        public void setResult_code(String result_code) {
            this.result_code = result_code;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public AccountReduceDomain getData() {
            return data;
        }

        public void setData(AccountReduceDomain data) {
            this.data = data;
        }
    }

    public String getIs_success() {
        return is_success;
    }

    public void setIs_success(String is_success) {
        this.is_success = is_success;
    }

    public String getSing_type() {
        return sing_type;
    }

    public void setSing_type(String sing_type) {
        this.sing_type = sing_type;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public BusinessData getData() {
        return data;
    }

    public void setData(BusinessData data) {
        this.data = data;
    }
}
