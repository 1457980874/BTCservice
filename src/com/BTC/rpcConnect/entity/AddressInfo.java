package com.BTC.rpcConnect.entity;

public class AddressInfo {
    String address;
    String scriptPubKey;
    boolean ismine;
    boolean solvable;
    String desc;
    boolean iswatchonly;
    boolean isscript;
    boolean iswitness;
    String pubkey;
    boolean iscompressed;
    boolean ischange;
    String timestamp;
    String hdkeypath;
    String hdseedid;
    String hdmasterfingerprint;
    String[] labels;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getScriptPubKey() {
        return scriptPubKey;
    }

    public void setScriptPubKey(String scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    public boolean isIsmine() {
        return ismine;
    }

    public void setIsmine(boolean ismine) {
        this.ismine = ismine;
    }

    public boolean isSolvable() {
        return solvable;
    }

    public void setSolvable(boolean solvable) {
        this.solvable = solvable;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isIswatchonly() {
        return iswatchonly;
    }

    public void setIswatchonly(boolean iswatchonly) {
        this.iswatchonly = iswatchonly;
    }

    public boolean isIsscript() {
        return isscript;
    }

    public void setIsscript(boolean isscript) {
        this.isscript = isscript;
    }

    public boolean isIswitness() {
        return iswitness;
    }

    public void setIswitness(boolean iswitness) {
        this.iswitness = iswitness;
    }

    public String getPubkey() {
        return pubkey;
    }

    public void setPubkey(String pubkey) {
        this.pubkey = pubkey;
    }

    public boolean isIscompressed() {
        return iscompressed;
    }

    public void setIscompressed(boolean iscompressed) {
        this.iscompressed = iscompressed;
    }

    public boolean isIschange() {
        return ischange;
    }

    public void setIschange(boolean ischange) {
        this.ischange = ischange;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getHdkeypath() {
        return hdkeypath;
    }

    public void setHdkeypath(String hdkeypath) {
        this.hdkeypath = hdkeypath;
    }

    public String getHdseedid() {
        return hdseedid;
    }

    public void setHdseedid(String hdseedid) {
        this.hdseedid = hdseedid;
    }

    public String getHdmasterfingerprint() {
        return hdmasterfingerprint;
    }

    public void setHdmasterfingerprint(String hdmasterfingerprint) {
        this.hdmasterfingerprint = hdmasterfingerprint;
    }

    public String[] getLabels() {
        return labels;
    }

    public void setLabels(String[] labels) {
        this.labels = labels;
    }
}
