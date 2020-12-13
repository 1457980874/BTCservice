package com.BTC.rpcConnect;

import com.BTC.rpcConnect.entity.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    //1
    public BlockHeader getBlockHeader(String hash){
        String json = rpcUtils.prepareJSON("getblockheader",hash);
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL,map,json);
        if (result == null){
            System.out.println("第一个"+result);
            return null;
        }
        if (result.getCode() == HttpStatus.SC_OK){
            String resultStr = result.getData().getResult();
            System.out.println(resultStr);
            return JSON.parseObject(resultStr,BlockHeader.class);
        }
        return null;
    }
    //2 解析json数组未完成
    public List<Chain>  getChainTips(){
        String json = rpcUtils.prepareJSON("getchaintips");
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL,map,json);
        if (result == null){
            return null;
        }
        if (result.getCode() == HttpStatus.SC_OK){
            String jsonStr = result.getData().getResult();
            List<Chain> list = new ArrayList<Chain>(JSONArray.parseArray(jsonStr,Chain.class));
            return list;
        }
        return null;
    }
    //3
    public String getDifficulty(){
        String json = rpcUtils.prepareJSON("getdifficulty");
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL,map,json);
        if (result == null){
            return null;
        }
        if (result.getCode() == HttpStatus.SC_OK){
            return result.getData().getResult();
        }
        return null;
    }
    //4
    public MempoolInfo getMempoolInfo(){
        String json = rpcUtils.prepareJSON("getmempoolinfo");
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL,map,json);
        if (result == null){
            return null;
        }
        if (result.getCode() == HttpStatus.SC_OK){
            String resultStr = result.getData().getResult();
            return JSON.parseObject(resultStr,MempoolInfo.class);
        }
        return null;
    }
    //5
    public TXOutSetInfo getTXOutSetInfo(){
        String json = rpcUtils.prepareJSON("gettxoutsetinfo");
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL,map,json);
        if (result == null){
            return null;
        }
        if (result.getCode() == HttpStatus.SC_OK){
            String resultStr = result.getData().getResult();
            return JSON.parseObject(resultStr,TXOutSetInfo.class);
        }
        return null;
    }
    //6
    public String preciousBlock(String hash){
        String json = rpcUtils.prepareJSON("preciousblock",hash);
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL,map,json);
        if (result == null){
            return null;
        }
        if (result.getCode() == HttpStatus.SC_OK){
            return result.getData().getResult();
        }
        return null;
    }
    //7
    public String pruneBlockChain(int height){
        String json = rpcUtils.prepareJSON("prunblockchain",height);
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL,map,json);
        if (result == null){
            return null;
        }
        if (result.getCode() == HttpStatus.SC_OK){
            return result.getData().getResult();
        }
        return null;
    }
    //8
    public AddressInfo getAddressInfo(String address){
        String json = rpcUtils.prepareJSON("getaddressinfo",address);
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL,map,json);
        if (result == null){
            return null;
        }
        if (result.getCode() == HttpStatus.SC_OK){
            String resultStr = result.getData().getResult();
            return JSON.parseObject(resultStr,AddressInfo.class);
        }
        return null;
    }
    //9
    public WalletInfo getWalletInfo(){
        String json = rpcUtils.prepareJSON("getwalletinfo");
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL,map,json);
        if (result == null){
            return null;
        }
        if (result.getCode() == HttpStatus.SC_OK){
            String resultStr = result.getData().getResult();
            return JSON.parseObject(resultStr,WalletInfo.class);
        }
        return null;
    }
    //10
    public MemoryInfo getMemoryInfo(){
        String json = rpcUtils.prepareJSON("getmemoryinfo");
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL,map,json);
        if (result == null){
            return null;
        }
        if (result.getCode() == HttpStatus.SC_OK){
            String resultStr = result.getData().getResult();
            return JSON.parseObject(resultStr,MemoryInfo.class);
        }
        return null;
    }
}
