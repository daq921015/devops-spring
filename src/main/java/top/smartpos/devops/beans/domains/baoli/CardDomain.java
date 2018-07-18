package top.smartpos.devops.beans.domains.baoli;


/**
 * 卡信息
 */
public class CardDomain {
    private String CardNo;
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
