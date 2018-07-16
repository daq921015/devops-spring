package top.smartpos.devops.beans.Models.baoli;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@ApiModel(value = "获取会员", description = "获取会员", parent = BaoLiBasicModel.class)
public class GetVipInfoModel extends BaoLiBasicModel {
    @Pattern(regexp = "^\\d{11,20}$", message = "手机号必须为11~20位的整数")
    @ApiModelProperty(value = "手机号(11~20位的整数)", example = "18512345678")
    private String cellphone;
    @Length(max = 40, message = "卡号最多40个字符")
    @ApiModelProperty(value = "会员卡号")
    private String card;
    @Length(max = 100, message = "卡号最多100个字符")
    @ApiModelProperty(value = "会员动态卡")
    private String dynamiccard;
    @Pattern(regexp = "^cw\\.member\\.all$", message = "service:接口名称必须为cw.member.all")
    @ApiModelProperty(value = "查询会员接口名称：cw.member.all", example = "cw.member.all")
    private String service;

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getDynamiccard() {
        return dynamiccard;
    }

    public void setDynamiccard(String dynamiccard) {
        this.dynamiccard = dynamiccard;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
