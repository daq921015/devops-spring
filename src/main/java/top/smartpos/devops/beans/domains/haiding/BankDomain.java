package top.smartpos.devops.beans.domains.haiding;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "银行信息")
public class BankDomain {
    @ApiModelProperty("唯一标示")
    private String uuid;
    @ApiModelProperty("代码")
    private String code;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("统一代码")
    private String uniCode;
    @ApiModelProperty("类型")
    private String type;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniCode() {
        return uniCode;
    }

    public void setUniCode(String uniCode) {
        this.uniCode = uniCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
