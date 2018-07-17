package top.smartpos.devops.beans.Models.haiding;

import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel(value = "post请求体结构")
public class SaleSaveModel {
    private String posNo;
    private String flowNo;
    private String ocrTime;
    private String score;
    private String qty;
    private String realAmt;
    private String cardNo;
    private List<PaymentModel> payments;
    private List<ProductModel> products;

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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getRealAmt() {
        return realAmt;
    }

    public void setRealAmt(String realAmt) {
        this.realAmt = realAmt;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "SaleSaveModel{" +
                "posNo='" + posNo + '\'' +
                ", flowNo='" + flowNo + '\'' +
                ", ocrTime='" + ocrTime + '\'' +
                ", score='" + score + '\'' +
                ", qty='" + qty + '\'' +
                ", realAmt='" + realAmt + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", payments=" + payments +
                ", products=" + products +
                '}';
    }
}
