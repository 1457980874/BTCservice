package com.BTC.rpcConnect.entity;

public class Locked {
    int used;
    int free;
    int total;
    int locked;
    int chunks_used;
    int chunks_free;

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public int getFree() {
        return free;
    }

    public void setFree(int free) {
        this.free = free;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getLocked() {
        return locked;
    }

    public void setLocked(int locked) {
        this.locked = locked;
    }

    public int getChunks_used() {
        return chunks_used;
    }

    public void setChunks_used(int chunks_used) {
        this.chunks_used = chunks_used;
    }

    public int getChunks_free() {
        return chunks_free;
    }

    public void setChunks_free(int chunks_free) {
        this.chunks_free = chunks_free;
    }
}
