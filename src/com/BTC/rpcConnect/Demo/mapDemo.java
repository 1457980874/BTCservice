package com.BTC.rpcConnect.Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();

        map.put("name","王老五");
        map.put("age","18");
        map.put("sex","male");

        //遍历
        Set<String> keyset = map.keySet();
        for (String key : keyset){
            String value = map.get(key);
            System.out.println(value);
        }

    }
}
