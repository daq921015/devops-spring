package top.smartpos.devops.beans.domains.baoli;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 优惠券信息
 */
@ApiModel(value = "优惠券信息")
public class CouponDomain {
    /**
     * 优惠券号
     */
    @ApiModelProperty("优惠券号")
    private String couponkeys;
    @ApiModelProperty("优惠券名称")
    private String title;
    @ApiModelProperty("优惠券面值")
    private String couponvalue;
    @ApiModelProperty("生效时间")
    private String starttime;
    @ApiModelProperty("失效时间")
    private String endtime;
    @ApiModelProperty("优惠券类型")
    private String type;
    @ApiModelProperty("优惠券类型描述")
    private String typedesc;
    @ApiModelProperty("最多抵现金额")
    private String max;
    @ApiModelProperty("使用金额门槛")
    private String condition;

    public String getCouponkeys() {
        return couponkeys;
    }

    public void setCouponkeys(String couponkeys) {
        this.couponkeys = couponkeys;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCouponvalue() {
        return couponvalue;
    }

    public void setCouponvalue(String couponvalue) {
        this.couponvalue = couponvalue;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypedesc() {
        return typedesc;
    }

    public void setTypedesc(String typedesc) {
        this.typedesc = typedesc;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
