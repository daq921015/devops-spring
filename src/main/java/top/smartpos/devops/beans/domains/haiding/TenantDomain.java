package top.smartpos.devops.beans.domains.haiding;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "商户")
public class TenantDomain {
    @ApiModelProperty("唯一编号")
    private String uuid;
    @ApiModelProperty("商户编号")
    private String code;
    @ApiModelProperty("商户名称")
    private String name;

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
}
