package top.smartpos.devops.beans.Models.baoli;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class AccounReduceModel extends BaoLiBasicModel {
    @Pattern(regexp = "^\\d{11,20}$", message = "手机号必须为11~20位的整数")
    private String cellphone;
    private String validate;
    private String cardtrack;
    private String dynamiccard;
    @NotBlank(message = "事务id不可空")
    private String transid;
    @Pattern(regexp = "^(0|[1-9][0-9]{0,9})(\\.[0-9]{1,2})?$", message = "扣减金额不能为空且最多两位小数")
    private String money;
    @NotBlank(message = "场景code不可空")
    private String scenecode;
    @Pattern(regexp = "^[1|2|3|4]$", message = "类型不可空(1:扣减,2:扣减查询,3:撤销,4:撤销查询(10天内))")
    private String type;
    @Length(max = 16, message = "门店号最多16个字符")
    private String storeid;
    @Length(max = 16, message = "交易终端号最多16个字符")
    private String posid;
    @NotBlank(message = "交易流水号不可空")
    private String invoice_no;
    private String invoice_name;
    @Length(max = 20, message = "操作员号最多16个字符")
    private String operid;
    @Pattern(regexp = "^cw\\.member\\.account\\.reduce$", message = "service:接口名称必须为cw.member.account.reduce")
    private String service;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getValidate() {
        return validate;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }

    public String getCardtrack() {
        return cardtrack;
    }

    public void setCardtrack(String cardtrack) {
        this.cardtrack = cardtrack;
    }

    public String getDynamiccard() {
        return dynamiccard;
    }

    public void setDynamiccard(String dynamiccard) {
        this.dynamiccard = dynamiccard;
    }

    public String getTransid() {
        return transid;
    }

    public void setTransid(String transid) {
        this.transid = transid;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getScenecode() {
        return scenecode;
    }

    public void setScenecode(String scenecode) {
        this.scenecode = scenecode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid;
    }

    public String getPosid() {
        return posid;
    }

    public void setPosid(String posid) {
        this.posid = posid;
    }

    public String getInvoice_no() {
        return invoice_no;
    }

    public void setInvoice_no(String invoice_no) {
        this.invoice_no = invoice_no;
    }

    public String getInvoice_name() {
        return invoice_name;
    }

    public void setInvoice_name(String invoice_name) {
        this.invoice_name = invoice_name;
    }

    public String getOperid() {
        return operid;
    }

    public void setOperid(String operid) {
        this.operid = operid;
    }
}
