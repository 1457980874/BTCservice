package com.BTC.rpcConnect.entity;

public class WalletInfo {
    String walletname;
    String walletversion;
    double balance;
    double unconfirmed_balance;
    double immature_balance;
    int txcount;
    String keypoololdest;
    int keypoolsize;
    String hdseedid;
    String keypoolsize_hd_internal;
    double paytxfee;
    boolean private_keys_enabled;
    boolean avoid_reuse;
    boolean scanning;

    public String getWalletname() {
        return walletname;
    }

    public void setWalletname(String walletname) {
        this.walletname = walletname;
    }

    public String getWalletversion() {
        return walletversion;
    }

    public void setWalletversion(String walletversion) {
        this.walletversion = walletversion;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getUnconfirmed_balance() {
        return unconfirmed_balance;
    }

    public void setUnconfirmed_balance(double unconfirmed_balance) {
        this.unconfirmed_balance = unconfirmed_balance;
    }

    public double getImmature_balance() {
        return immature_balance;
    }

    public void setImmature_balance(double immature_balance) {
        this.immature_balance = immature_balance;
    }

    public int getTxcount() {
        return txcount;
    }

    public void setTxcount(int txcount) {
        this.txcount = txcount;
    }

    public String getKeypoololdest() {
        return keypoololdest;
    }

    public void setKeypoololdest(String keypoololdest) {
        this.keypoololdest = keypoololdest;
    }

    public int getKeypoolsize() {
        return keypoolsize;
    }

    public void setKeypoolsize(int keypoolsize) {
        this.keypoolsize = keypoolsize;
    }

    public String getHdseedid() {
        return hdseedid;
    }

    public void setHdseedid(String hdseedid) {
        this.hdseedid = hdseedid;
    }

    public String getKeypoolsize_hd_internal() {
        return keypoolsize_hd_internal;
    }

    public void setKeypoolsize_hd_internal(String keypoolsize_hd_internal) {
        this.keypoolsize_hd_internal = keypoolsize_hd_internal;
    }

    public double getPaytxfee() {
        return paytxfee;
    }

    public void setPaytxfee(double paytxfee) {
        this.paytxfee = paytxfee;
    }

    public boolean isPrivate_keys_enabled() {
        return private_keys_enabled;
    }

    public void setPrivate_keys_enabled(boolean private_keys_enabled) {
        this.private_keys_enabled = private_keys_enabled;
    }

    public boolean isAvoid_reuse() {
        return avoid_reuse;
    }

    public void setAvoid_reuse(boolean avoid_reuse) {
        this.avoid_reuse = avoid_reuse;
    }

    public boolean isScanning() {
        return scanning;
    }

    public void setScanning(boolean scanning) {
        this.scanning = scanning;
    }
}
