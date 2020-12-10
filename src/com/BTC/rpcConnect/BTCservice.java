package com.BTC.rpcConnect;

import com.BTC.rpcConnect.entity.*;
import com.alibaba.fastjson.JSON;
import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

public class BTCservice {

    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("Encoding", "UTF-8");
        map.put("Content-type", "application/json");
        map.put("Authorization", "Basic " + rpcUtils.base64Str(RPCinformation.USER + ":" + RPCinformation.PASSWORD));
    }

    public int getBlockCount() {
        String json = rpcUtils.prepareJSON(BTCcommand.getGETBLOCKCOUNT());
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL, map, json);
        if (result.getCode() == HttpStatus.SC_OK) {
            String data = result.getData().getResult();
            //int -> Integer
            int count = Integer.parseInt(data);
            return count;
        }
        return -1;
    }

    public String getBlockHash(int height) {
        String json = rpcUtils.prepareJSON(BTCcommand.getGETBLOCKHASH(), height);
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL, map, json);
        if (result == null) {
            return null;
        }
        if (result.getCode() == HttpStatus.SC_OK) {
            return result.getData().getResult();
        } else {
            return null;
        }
    }

    public BlockChainInfo getBlockChainInfo(){
        String json = rpcUtils.prepareJSON("getblockchaininfo");
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL,map,json);
        if (result ==null){
            return null;
        }
        if (result.getCode()==HttpStatus.SC_OK){
            String resultStr = result.getData().getResult();
            return JSON.parseObject(resultStr,BlockChainInfo.class);
        }
        return null;
    }

    public BlockInfo getBlock(String hash){
        String json = rpcUtils.prepareJSON("getblock",hash);
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL,map,json);
        if (result ==null){
            return null;
        }
        if (result.getCode() ==HttpStatus.SC_OK){
            String resultStr = result.getData().getResult();
            return JSON.parseObject(resultStr,BlockInfo.class);
        }
        return null;
    }

    public String getNewAddress(String label, ADDRESS_TYPE type){
        //String addressType = type.getAddressType();
        String addresstype = EnumUtils.getAddressType(type);
        String json = rpcUtils.prepareJSON("getnewaddress",label,addresstype);
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL,map,json);
        if (result == null){
            return null;
        }
        if (result.getCode() == HttpStatus.SC_OK){
            return result.getData().getResult();
        }
        return null;
    }
}
