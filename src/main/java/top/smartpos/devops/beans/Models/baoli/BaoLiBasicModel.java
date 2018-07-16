package top.smartpos.devops.beans.Models.baoli;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class BaoLiBasicModel {
    @NotBlank(message = "appkey:应用号不能为空")
    private String appkey;
    @NotBlank(message = "merchant_id:商户ID不能为空")
    private String merchant_id;
    @Pattern(regexp = "^utf-8$", message = "_input_charset:字符集必须为utf-8")
    private String _input_charset;
    @Pattern(regexp = "^MD5$", message = "sing_type:签名方式必须为MD5")
    private String sing_type;
    @Pattern(regexp = "^[a-fA-F0-9]{32}$", message = "sign:必须32位签名结果字符串")
    private String sign;
    @Pattern(regexp = "^[1|2]$", message = "cw_ca_request:必须为1或2")
    private String cw_ca_request;

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String get_input_charset() {
        return _input_charset;
    }

    public void set_input_charset(String _input_charset) {
        this._input_charset = _input_charset;
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

    public String getCw_ca_request() {
        return cw_ca_request;
    }

    public void setCw_ca_request(String cw_ca_request) {
        this.cw_ca_request = cw_ca_request;
    }
}
