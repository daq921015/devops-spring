package top.smartpos.devops.beans.domains.haiding;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "付款方式")
public class PaymentDomain {
    @ApiModelProperty("唯一表示")
    private String uuid;
    @ApiModelProperty("代码")
    private String code;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("项目")
    private List<StoreDomain> store;
    @ApiModelProperty("商户")
    private List<TenantDomain> tenant;

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

    public List<StoreDomain> getStore() {
        return store;
    }

    public void setStore(List<StoreDomain> store) {
        this.store = store;
    }

    public List<TenantDomain> getTenant() {
        return tenant;
    }

    public void setTenant(List<TenantDomain> tenant) {
        this.tenant = tenant;
    }
}
