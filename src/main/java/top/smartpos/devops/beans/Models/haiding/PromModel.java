package top.smartpos.devops.beans.Models.haiding;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "优惠明细")
public class PromModel {
    private String promType;
    private String promTotal;

    public String getPromType() {
        return promType;
    }

    public void setPromType(String promType) {
        this.promType = promType;
    }

    public String getPromTotal() {
        return promTotal;
    }

    public void setPromTotal(String promTotal) {
        this.promTotal = promTotal;
    }
}
