package top.smartpos.devops.beans.domains;

import top.smartpos.devops.beans.base.BasicDomain;

import java.math.BigInteger;

public class DEnv extends BasicDomain {
    private BigInteger id;
    private String envName;
    private String tunnelIp;
    private String tunnelUser;
    private String tunnelPwd;
    private String tunnelPort;
    private String nfsIp;
    private String nfsUser;
    private String nfsPwd;
    private String nfsPort;
    private String logDbIp;
    private String logDbUser;
    private String logDbPwd;
    private String logDbPort;
    private String regionId;
    private String accessKeyId;
    private String accessDeySecret;


    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public String getTunnelIp() {
        return tunnelIp;
    }

    public void setTunnelIp(String tunnelIp) {
        this.tunnelIp = tunnelIp;
    }

    public String getTunnelUser() {
        return tunnelUser;
    }

    public void setTunnelUser(String tunnelUser) {
        this.tunnelUser = tunnelUser;
    }

    public String getTunnelPwd() {
        return tunnelPwd;
    }

    public void setTunnelPwd(String tunnelPwd) {
        this.tunnelPwd = tunnelPwd;
    }

    public String getTunnelPort() {
        return tunnelPort;
    }

    public void setTunnelPort(String tunnelPort) {
        this.tunnelPort = tunnelPort;
    }

    public String getNfsIp() {
        return nfsIp;
    }

    public void setNfsIp(String nfsIp) {
        this.nfsIp = nfsIp;
    }

    public String getNfsUser() {
        return nfsUser;
    }

    public void setNfsUser(String nfsUser) {
        this.nfsUser = nfsUser;
    }

    public String getNfsPwd() {
        return nfsPwd;
    }

    public void setNfsPwd(String nfsPwd) {
        this.nfsPwd = nfsPwd;
    }

    public String getNfsPort() {
        return nfsPort;
    }

    public void setNfsPort(String nfsPort) {
        this.nfsPort = nfsPort;
    }

    public String getLogDbIp() {
        return logDbIp;
    }

    public void setLogDbIp(String logDbIp) {
        this.logDbIp = logDbIp;
    }

    public String getLogDbUser() {
        return logDbUser;
    }

    public void setLogDbUser(String logDbUser) {
        this.logDbUser = logDbUser;
    }

    public String getLogDbPwd() {
        return logDbPwd;
    }

    public void setLogDbPwd(String logDbPwd) {
        this.logDbPwd = logDbPwd;
    }

    public String getLogDbPort() {
        return logDbPort;
    }

    public void setLogDbPort(String logDbPort) {
        this.logDbPort = logDbPort;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessDeySecret() {
        return accessDeySecret;
    }

    public void setAccessDeySecret(String accessDeySecret) {
        this.accessDeySecret = accessDeySecret;
    }
}
