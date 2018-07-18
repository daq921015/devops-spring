package top.smartpos.devops.beans.domains.baoli.result;

import top.smartpos.devops.beans.domains.baoli.AccountReduceDomain;

public class ResultAccountReduceDomain {
    private String is_success;
    private String sing_type;
    private String sign;
    private BusinessData data;

    private class BusinessData {
        private String result_code;
        private String info;
        private AccountReduceDomain data;

        public String getResult_code() {
            return result_code;
        }

        public void setResult_code(String result_code) {
            this.result_code = result_code;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public AccountReduceDomain getData() {
            return data;
        }

        public void setData(AccountReduceDomain data) {
            this.data = data;
        }
    }

    public String getIs_success() {
        return is_success;
    }

    public void setIs_success(String is_success) {
        this.is_success = is_success;
    }

    public String getSing_type() {
        return sing_type;
    }

    public void setSing_type(String sing_type) {
        this.sing_type = sing_type;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public BusinessData getData() {
        return data;
    }

    public void setData(BusinessData data) {
        this.data = data;
    }
}
