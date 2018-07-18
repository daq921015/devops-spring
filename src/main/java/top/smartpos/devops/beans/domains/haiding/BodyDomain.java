package top.smartpos.devops.beans.domains.haiding;

import java.util.List;

public class BodyDomain {
    private List<PaymentDomain> payments;
    private List<BankDomain> banks;
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
