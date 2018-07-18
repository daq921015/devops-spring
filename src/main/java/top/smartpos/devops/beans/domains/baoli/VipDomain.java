package top.smartpos.devops.beans.domains.baoli;

import java.util.List;

/**
 * 获取会员、卡、优惠券信息返回结果
 */
public class VipDomain {
    private String memberid;
    private String name;
    private String cellphone;
    private String levelid;
    private String level_name;
    private String email;
    private String sex;
    private String birthday;
    private String passport;
    private String photourl;
    private String value;
    private String value2;
    private String point_exchange;
    private String min_stock_use_limit;
    private String balance;
    private String discount;
    private List<CardDomain> card;
    private List<CouponDomain> coupon;

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getLevelid() {
        return levelid;
    }

    public void setLevelid(String levelid) {
        this.levelid = levelid;
    }

    public String getLevel_name() {
        return level_name;
    }

    public void setLevel_name(String level_name) {
        this.level_name = level_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getPoint_exchange() {
        return point_exchange;
    }

    public void setPoint_exchange(String point_exchange) {
        this.point_exchange = point_exchange;
    }

    public String getMin_stock_use_limit() {
        return min_stock_use_limit;
    }

    public void setMin_stock_use_limit(String min_stock_use_limit) {
        this.min_stock_use_limit = min_stock_use_limit;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public List<CardDomain> getCard() {
        return card;
    }

    public void setCard(List<CardDomain> card) {
        this.card = card;
    }

    public List<CouponDomain> getCoupon() {
        return coupon;
    }

    public void setCoupon(List<CouponDomain> coupon) {
        this.coupon = coupon;
    }
}
