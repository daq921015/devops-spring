package top.smartpos.devops.beans.Models.haiding;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

@ApiModel(value = "上传流水数据结构")
public class SaleSaveModel extends BasicModel {
    @ApiModelProperty(value = "收银机号", required = true, example = "09999")
    @NotBlank(message = "收银机号不允许为空")
    private String posNo;
    @ApiModelProperty(value = "交易流水号", required = true, example = "No20150722")
    private String flowNo;
    @ApiModelProperty(value = "交易发生时间", required = true, example = "2014.09.18 15:22:24")
    private String ocrTime;
    @ApiModelProperty(value = "退货原交易发生时间", example = "2014.09.18 15:22:24")
    private String backTime;
    @ApiModelProperty(value = "交易总积分", example = "88")
    private int score;
    @ApiModelProperty(value = "交易总数量", required = true, example = "88")
    private int qty;
    @ApiModelProperty(value = "实际总金额", example = "888")
    private Double realAmt;
    @ApiModelProperty(value = "会员卡号", example = "No001")
    private String cardNo;
    @ApiModelProperty(value = "说明", example = "说明")
    private String memo;
    @ApiModelProperty(value = "交易付款明细", required = true)
    @Valid
    private List<PaymentModel> payments;
    @ApiModelProperty(value = "交易商品明细", required = true)
    @Valid
    private List<ProductModel> products;

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public String getFlowNo() {
        return flowNo;
    }

    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo;
    }

    public String getOcrTime() {
        return ocrTime;
    }

    public void setOcrTime(String ocrTime) {
        this.ocrTime = ocrTime;
    }

    public String getBackTime() {
        return backTime;
    }

    public void setBackTime(String backTime) {
        this.backTime = backTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Double getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(Double realAmt) {
        this.realAmt = realAmt;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public List<PaymentModel> getPayments() {
        return payments;
    }

    public void setPayments(List<PaymentModel> payments) {
        this.payments = payments;
    }

    public List<ProductModel> getProducts() {
        return products;
    }

    public void setProducts(List<ProductModel> products) {
        this.products = products;
    }
}
