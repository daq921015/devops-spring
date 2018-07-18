package top.smartpos.devops.beans.domains.haiding;

import java.util.List;

public class PaymentDomain {
    private String uuid;
    private String code;
    private String name;
    private List<StoreDomain> store;
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
