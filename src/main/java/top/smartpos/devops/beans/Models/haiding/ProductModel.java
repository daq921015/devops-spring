package top.smartpos.devops.beans.Models.haiding;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.List;

@ApiModel(value = "交易商品明细")
public class ProductModel {
    @ApiModelProperty(value = "行号", required = true, example = "1")
    private String line;
    @ApiModelProperty(value = "商品 uuid", required = true, example = "9c9a3005a23c4be48461b5fa1ddaea81")
    private String product;
    @ApiModelProperty(value = "商品行积分", required = true, example = "88")
    private int score;
    @ApiModelProperty(value = "商品名称", example = "茄子")
    private String productName;
    @ApiModelProperty(value = "数量", required = true, example = "88")
    private int qty;
    @ApiModelProperty(value = "总金额", required = true, example = "888")
    private double total;
    @ApiModelProperty(value = "单价", required = true, example = "88")
    private double price;
    @ApiModelProperty(value = "优惠金额", example = "88")
    private String discount;
    @ApiModelProperty(value = "说明", example = "说明")
    private String memo;
    @ApiModelProperty(value = "优惠明细")
    @Valid
    private List<PromModel> proms;

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public List<PromModel> getProms() {
        return proms;
    }

    public void setProms(List<PromModel> proms) {
        this.proms = proms;
    }
}
