package top.smartpos.devops.beans.domains.haiding;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "项目")
public class StoreDomain {
    @ApiModelProperty("唯一编号")
    private String uuid;
    @ApiModelProperty("项目编号")
    private String code;
    @ApiModelProperty("项目名称")
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
