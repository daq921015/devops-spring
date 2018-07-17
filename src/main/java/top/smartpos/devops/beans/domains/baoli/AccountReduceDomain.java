package top.smartpos.devops.beans.domains.baoli;

import io.swagger.annotations.ApiModelProperty;

/**
 * 会员储值支付返回结果
 */
public class AccountReduceDomain {
    @ApiModelProperty("会员号")
    private String memberid;
    @ApiModelProperty("会员姓名")
    private String membername;
    @ApiModelProperty("交易后余额")
    private String balance;
    @ApiModelProperty("交易时间")
    private String datetime;
    @ApiModelProperty("交易流水号")
    private String trace_no;

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getTrace_no() {
        return trace_no;
    }

    public void setTrace_no(String trace_no) {
        this.trace_no = trace_no;
    }
}
