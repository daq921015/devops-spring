package top.smartpos.devops.beans.Models.haiding;

import io.swagger.annotations.ApiModel;

import java.util.List;

@ApiModel(value = "交易商品明细")
public class ProductModel {
    private String line;
    private String backLine;
    private String product;
    private String qty;
    private String total;
    private String price;
    private String score;
    private String discount;
    private List<PromModel> proms;

    public List<PromModel> getProms() {
        return proms;
    }

    public void setProms(List<PromModel> proms) {
        this.proms = proms;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getBackLine() {
        return backLine;
    }

    public void setBackLine(String backLine) {
        this.backLine = backLine;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}
