package top.smartpos.devops.beans.Models.haiding;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

@ApiModel(value = "优惠明细")
public class PromModel {
    @ApiModelProperty(value = "优惠类型", required = true, example = "card")
    @NotBlank(message = "优惠类型不允许为空")
    private String promType;
    @ApiModelProperty(value = "优惠金额", required = true, example = "88")
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
