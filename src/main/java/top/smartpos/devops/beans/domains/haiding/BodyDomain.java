package top.smartpos.devops.beans.domains.haiding;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "响应body体")
public class BodyDomain {
    @ApiModelProperty("付款方式")
    private List<PaymentDomain> payments;
    @ApiModelProperty("银行")
    private List<BankDomain> banks;
    @ApiModelProperty("商品")
    private List<ProductDomain> products;

    public List<PaymentDomain> getPayments() {
        return payments;
    }

    public void setPayments(List<PaymentDomain> payments) {
        this.payments = payments;
    }

    public List<BankDomain> getBanks() {
        return banks;
    }

    public void setBanks(List<BankDomain> banks) {
        this.banks = banks;
    }

    public List<ProductDomain> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDomain> products) {
        this.products = products;
    }
}
