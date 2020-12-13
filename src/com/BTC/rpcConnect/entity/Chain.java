package com.BTC.rpcConnect.entity;

public class Chain {
    long height;
    String hash;
    long branchlen;
    String status;

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public long getBranchlen() {
        return branchlen;
    }

    public void setBranchlen(long branchlen) {
        this.branchlen = branchlen;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
