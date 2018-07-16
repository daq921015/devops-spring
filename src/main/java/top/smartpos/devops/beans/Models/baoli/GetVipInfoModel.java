package top.smartpos.devops.beans.Models.baoli;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

public class GetVipInfoModel extends BaoLiBasicModel {
    @Pattern(regexp = "^\\d{11,20}$", message = "手机号必须为11~20位的整数")
    private String cellphone;
    @Length(max = 40, message = "卡号最多40个字符")
    private String card;
    @Length(max = 100, message = "卡号最多100个字符")
    private String dynamiccard;
    @Pattern(regexp = "^cw\\.member\\.all$", message = "service:接口名称必须为cw.member.all")
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
