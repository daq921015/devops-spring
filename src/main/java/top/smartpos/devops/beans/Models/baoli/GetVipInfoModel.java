package top.smartpos.devops.beans.Models.baoli;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;


public class GetVipInfoModel {
    @Pattern(regexp = "^\\d{11,20}$", message = "手机号必须为11~20位的整数")
    private String cellphone;
    private String card;
    private String dynamiccard;

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

    @Override
    public String toString() {
        return "GetVipInfoModel{" +
                "cellphone='" + cellphone + '\'' +
                ", card='" + card + '\'' +
                ", dynamiccard='" + dynamiccard + '\'' +
                '}';
    }
}
