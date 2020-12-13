package com.BTC.rpcConnect.entity;

public class BlockHeader {
    String hash;
    int confirmations;
    int height;
    String version;
    String versionHex;
    String merkleroot;
    String time;
    String mediantime;
    String nonce;
    String bits;
    String difficulty;
    String chainwork;
    int nTx;

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setVersionHex(String versionHex) {
        this.versionHex = versionHex;
    }

    public void setMerkleroot(String merkleroot) {
        this.merkleroot = merkleroot;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setMediantime(String mediantime) {
        this.mediantime = mediantime;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public void setBits(String bits) {
        this.bits = bits;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    public void setnTx(int nTx) {
        this.nTx = nTx;
    }

    public String getHash() {
        return hash;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public int getHeight() {
        return height;
    }

    public String getVersion() {
        return version;
    }

    public String getVersionHex() {
        return versionHex;
    }

    public String getMerkleroot() {
        return merkleroot;
    }

    public String getTime() {
        return time;
    }

    public String getMediantime() {
        return mediantime;
    }

    public String getNonce() {
        return nonce;
    }

    public String getBits() {
        return bits;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getChainwork() {
        return chainwork;
    }

    public int getnTx() {
        return nTx;
    }
}
