package top.smartpos.devops.beans.Models.baoli;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class BaoLiBasicModel {
    @NotBlank(message = "appkey:应用号不能为空")
    @ApiModelProperty(value = "应用号：由汉朔提供", required = true, example = "123456")
    private String appkey;
    @NotBlank(message = "merchant_id:商户ID不能为空")
    @ApiModelProperty(value = "商户ID:商家/平台渠道", required = true, example = "123456")
    private String merchant_id;
    @Pattern(regexp = "^utf-8$", message = "_input_charset:字符集必须为utf-8")
    @ApiModelProperty(value = "参数编码字符集,暂仅支持utf-8", required = true, example = "utf-8")
    private String _input_charset;
    @Pattern(regexp = "^MD5$", message = "sing_type:签名方式必须为MD5")
    @ApiModelProperty(value = "签名方式,暂仅支持MD5", required = true, example = "MD5")
    private String sing_type;
    @Pattern(regexp = "^[a-fA-F0-9]{32}$", message = "sign:必须32位签名结果字符串")
    @ApiModelProperty(value = "签名:32为MD5字符串", required = true, example = "aaaaa5aaaaa5aaaaa5aaaaa5aaaaa5aa")
    private String sign;
    @Pattern(regexp = "^[1|2]$", message = "cw_ca_request:必须为1或2")
    @ApiModelProperty(value = "签名类型(1:证书签名2:其他密钥签名.如果为空,默认为2)", required = true, example = "2")
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
