package com.BTC.rpcConnect;

import com.BTC.rpcConnect.entity.*;

import java.util.List;

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
            System.out.println("交易ID："+block.getTx());
        }
        address_type type = new address_type();
        type.setType(1);


        String address = server.getNewAddress("cjm",ADDRESS_TYPE.LEGACY);
        System.out.println("新地址是："+address);
        //bc1qskldlzehg5856v693pk0mg9agd3lrge2m9tjg2
        //33cEdnXP77rDu2TnCEBdMmpKEECjRMwbxd
        //1N54aQdkMZifitcMzypMpQwi8Dph4uSPLc

        BlockHeader blockHeader = server.getBlockHeader("000000000019d6689c085ae165831e934ff763ae46a2a6c172b3f1b60a8ce26f");
        System.out.println("区块的默克尔根是："+blockHeader.getMerkleroot());
        System.out.println("这个区块头的hash是："+blockHeader.getHash());

        List<Chain> tips = server.getChainTips();
        System.out.println("标签的状态："+tips.get(0).getStatus());

        System.out.println("当前节点的难度是："+server.getDifficulty());

        MempoolInfo mempool = server.getMempoolInfo();
        System.out.println("内存池最大为："+mempool.getMaxmempool());

        TXOutSetInfo txOutSetInfo = server.getTXOutSetInfo();
        System.out.println("交易集合的hash序列化为："+txOutSetInfo.getHash_serialized_2());

        System.out.println("preciousBlock为："+server.preciousBlock("000000000019d6689c085ae165831e934ff763ae46a2a6c172b3f1b60a8ce26f"));

        System.out.println("通过高度修剪区块链："+server.pruneBlockChain(0));

        AddressInfo addressInfo = server.getAddressInfo("1E84A1U5QMb8CM1JxY1YHFdXKWfMUCErvF");
        System.out.println("地址的公钥是："+addressInfo.getScriptPubKey());
        System.out.println("地址的公钥脚本："+addressInfo.getScriptPubKey());

        WalletInfo walletInfo = server.getWalletInfo();
        System.out.println("钱包的版本："+walletInfo.getWalletversion());
        System.out.println("hdseedID:"+walletInfo.getHdseedid());

        MemoryInfo memoryInfo = server.getMemoryInfo();
        System.out.println("已用的块数量："+memoryInfo.getLocked().getChunks_free());
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
