package com.BTC.rpcConnect.entity;

public class TXOutSetInfo {
    long height;
    String bestblock;
    int transactions;
    int txouts;
    String bogosize;
    String hash_serialized_2;
    String disk_size;
    double total_amount;

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public String getBestblock() {
        return bestblock;
    }

    public void setBestblock(String bestblock) {
        this.bestblock = bestblock;
    }

    public int getTransactions() {
        return transactions;
    }

    public void setTransactions(int transactions) {
        this.transactions = transactions;
    }

    public int getTxouts() {
        return txouts;
    }

    public void setTxouts(int txouts) {
        this.txouts = txouts;
    }

    public String getBogosize() {
        return bogosize;
    }

    public void setBogosize(String bogosize) {
        this.bogosize = bogosize;
    }

    public String getHash_serialized_2() {
        return hash_serialized_2;
    }

    public void setHash_serialized_2(String hash_serialized_2) {
        this.hash_serialized_2 = hash_serialized_2;
    }

    public String getDisk_size() {
        return disk_size;
    }

    public void setDisk_size(String disk_size) {
        this.disk_size = disk_size;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }
}
