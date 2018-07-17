package top.smartpos.devops.beans.Models.haiding;

import javax.validation.constraints.NotBlank;

public class GetPosInfoModel {
    @NotBlank(message = "posId不能为空")
    private String posId;

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    @Override
    public String toString() {
        return "GetPosInfoModel{" +
                "posId='" + posId + '\'' +
                '}';
    }
}
