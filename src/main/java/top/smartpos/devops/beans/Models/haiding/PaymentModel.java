package top.smartpos.devops.beans.Models.haiding;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

@ApiModel(value = "交易付款明细")
public class PaymentModel {
    @ApiModelProperty(value = "行号", required = true, example = "1")
    private String line;
    @ApiModelProperty(value = "付款方式 uuid", required = true, example = "9c9a3005a23c4be48461b5fa1ddaea82")
    private String payment;
    @ApiModelProperty(value = "付款金额", required = true, example = "888")
    private String total;
    @ApiModelProperty(value = "找零金额", required = true, example = "0")
    private String charge;
    @ApiModelProperty(value = "不找零金额", required = true, example = "0")
    private String discharge;
    @ApiModelProperty(value = "会员卡号", example = "0001")
    private String cardNo;
    @ApiModelProperty(value = "银行统一代码", example = "001001")
    private String bankCode;
    @ApiModelProperty(value = "卡类型", example = "会员卡")
    private String cardType;
    @ApiModelProperty(value = "付款类型", example = "现金")
    private String payCls;

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getDischarge() {
        return discharge;
    }

    public void setDischarge(String discharge) {
        this.discharge = discharge;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getPayCls() {
        return payCls;
    }

    public void setPayCls(String payCls) {
        this.payCls = payCls;
    }
}
