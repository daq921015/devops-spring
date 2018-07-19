package top.smartpos.devops.beans.Models.haiding;

import javax.validation.constraints.NotBlank;

public class BasicModel {
    @NotBlank(message = "父类不能为空")
    private String mytest;

    public String getMytest() {
        return mytest;
    }

    public void setMytest(String mytest) {
        this.mytest = mytest;
    }
}
