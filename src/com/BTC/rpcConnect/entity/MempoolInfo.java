package com.BTC.rpcConnect.entity;

public class MempoolInfo {
    String  loaded;
    String size;
    String bytes;
    String usage;
    String maxmempool;
    String mempoolminfee;
    String minrelaytxfee;

    public String getLoaded() {
        return loaded;
    }

    public void setLoaded(String loaded) {
        this.loaded = loaded;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBytes() {
        return bytes;
    }

    public void setBytes(String bytes) {
        this.bytes = bytes;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getMaxmempool() {
        return maxmempool;
    }

    public void setMaxmempool(String maxmempool) {
        this.maxmempool = maxmempool;
    }

    public String getMempoolminfee() {
        return mempoolminfee;
    }

    public void setMempoolminfee(String mempoolminfee) {
        this.mempoolminfee = mempoolminfee;
    }

    public String getMinrelaytxfee() {
        return minrelaytxfee;
    }

    public void setMinrelaytxfee(String minrelaytxfee) {
        this.minrelaytxfee = minrelaytxfee;
    }
}
