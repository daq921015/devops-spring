package top.smartpos.devops.models.baoli;

import javax.validation.constraints.NotNull;

public class GetVipInfoModel {
    @NotNull(message = "")
    private String cellphone;
    @NotNull
    private String card;
    @NotNull
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
