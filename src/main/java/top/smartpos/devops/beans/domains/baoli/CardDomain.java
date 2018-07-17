package top.smartpos.devops.beans.domains.baoli;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 卡信息
 */
@ApiModel(value = "卡信息")
public class CardDomain {
    @ApiModelProperty("会员卡号")
    private String CardNo;
    @ApiModelProperty("会员卡状态")
    private String Status;

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String cardNo) {
        CardNo = cardNo;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
