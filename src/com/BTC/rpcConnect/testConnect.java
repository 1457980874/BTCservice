package com.BTC.rpcConnect;

import com.BTC.rpcConnect.entity.Bip;
import com.BTC.rpcConnect.entity.BlockChainInfo;
import com.BTC.rpcConnect.entity.BlockInfo;
import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 该类用于调用比特币节点的不同功能和方法，并返回相应的结果
 */
public class testConnect {

    public static void main(String[] args) {
        BTCservice server = new BTCservice();
        System.out.println(server.getBlockCount());
        System.out.println(server.getBlockHash(0));
        BlockChainInfo chainInfo = server.getBlockChainInfo();
        if (chainInfo!=null){
            System.out.println("当前节点的区块数"+chainInfo.getBlocks());
            System.out.println("当前节点的难度"+chainInfo.getDifficulty());
            List<Bip> bipList = chainInfo.getSoftforks();
            for (Bip bip : bipList){
                System.out.println(bip.getId());
            }
        }
        BlockInfo block = server.getBlock("000000000019d6689c085ae165831e934ff763ae46a2a6c172b3f1b60a8ce26f");
        if (block != null){
            System.out.println("当前区块大小："+block.getSize());
            System.out.println("时间："+block.getTime());
        }
    }

    /*public String getBestBlockHash(){
        String json = rpcUtils.prepareJSON("getbestblockhash");
        Map<String,String> map = new HashMap<>();
        map.put("Encoding","UTF-8");
        map.put("Content-type","application/json");
        map.put("Authorization","Basic " + rpcUtils.base64Str(RPCinformation.USER +":"+RPCinformation.PASSWORD));
        rpcResult result = rpcUtils.DoPost(RPCinformation.RPCURL,map,json);
        if (result.getCode()== HttpStatus.SC_OK){
            String data = result.getData();
        }
        return null;
    }*/
}
