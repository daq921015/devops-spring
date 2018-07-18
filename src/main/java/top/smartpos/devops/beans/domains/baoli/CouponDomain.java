package top.smartpos.devops.beans.domains.baoli;

/**
 * 优惠券信息
 */
public class CouponDomain {
    /**
     * 优惠券号
     */
    private String couponkeys;
    private String title;
    private String couponvalue;
    private String starttime;
    private String endtime;
    private String type;
    private String typedesc;
    private String max;
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
