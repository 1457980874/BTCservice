package com.BTC.rpcConnect.entity;

public class BTCcommand {
    private static final String GETBESTBLOCKHASH = "getbestblockhash";

    public static String getGETBESTBLOCKHASH() {
        return GETBESTBLOCKHASH;
    }

    public static String getGETBLOCKCOUNT() {
        return GETBLOCKCOUNT;
    }

    public static String getGETBLOCKHASH() {
        return GETBLOCKHASH;
    }

    public static String getPING() {
        return PING;
    }

    private static final String GETBLOCKCOUNT = "getblockcount";
    private static final String GETBLOCKHASH = "getblockhash";
    private static final String PING = "ping";
}
