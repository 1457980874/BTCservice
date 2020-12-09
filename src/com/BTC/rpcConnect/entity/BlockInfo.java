package com.BTC.rpcConnect.entity;

public class BlockInfo {
    private String hash;
    private int confirmations;
    private int strippedsize;
    private int size;
    private int weight;
    private int height;
    private String version;
    private String versionHex;
    private String merkleroot;
    private String[] tx;
    private String time;
    private String mediantime;
    private String noce;
    private String bits;
    private String difficulty;
    private String chainwork;
    private int nTx;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getStrippedsize() {
        return strippedsize;
    }

    public void setStrippedsize(int strippedsize) {
        this.strippedsize = strippedsize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersionHex() {
        return versionHex;
    }

    public void setVersionHex(String versionHex) {
        this.versionHex = versionHex;
    }

    public String getMerkleroot() {
        return merkleroot;
    }

    public void setMerkleroot(String merkleroot) {
        this.merkleroot = merkleroot;
    }

    public String[] getTx() {
        return tx;
    }

    public void setTx(String[] tx) {
        this.tx = tx;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMediantime() {
        return mediantime;
    }

    public void setMediantime(String mediantime) {
        this.mediantime = mediantime;
    }

    public String getNoce() {
        return noce;
    }

    public void setNoce(String noce) {
        this.noce = noce;
    }

    public String getBits() {
        return bits;
    }

    public void setBits(String bits) {
        this.bits = bits;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getChainwork() {
        return chainwork;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    public int getnTx() {
        return nTx;
    }

    public void setnTx(int nTx) {
        this.nTx = nTx;
    }
}
