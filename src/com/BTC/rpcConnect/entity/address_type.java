package com.BTC.rpcConnect.entity;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BEncoderStream;

public class address_type {
    private static final String Legacy = "legacy";
    private static final String P2sh_segwit = "p2sh-segwit";
    private static final String Bech32 = "bech32";
    private int type;//选择的类型，0,1,2

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAddressType() {
        switch (type) {
            case 0:
                return Legacy;
            case 1:
                return P2sh_segwit;
            case 2:
                return Bech32;
            default:
                return null;
        }
    }

    public static String getLegacy() {
        return Legacy;
    }

    public static String getP2sh_segwit() {
        return P2sh_segwit;
    }

    public static String getBech32() {
        return Bech32;
    }
}
