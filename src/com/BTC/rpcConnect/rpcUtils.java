package com.BTC.rpcConnect;

import com.BTC.rpcConnect.entity.BTCcommand;
import com.BTC.rpcConnect.entity.rpcResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.Set;


public class rpcUtils {
    public static void main(String[] args) {
        System.out.println(prepareJSON(new BTCcommand().getGETBESTBLOCKHASH()));

    }
    /**
     * 准备json通信的数据格式
     * @param method 要调用的方法
     * @param params 调用对方时传递的参数
     * @return rpc通信的json格式的请求数据
     */
    public static String prepareJSON(String method,Object... params){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id",System.currentTimeMillis());
        jsonObject.put("jsonrpc","2.0");
        jsonObject.put("method",method);
        if (params != null){
            jsonObject.put("params",params);
        }
        return jsonObject.toJSONString();
    }

    /**
     * 执行post网络请求
     * @param url 请求地址
     * @param header 请求头信息
     * @param body 请求体信息
     * @return 请求的结果
     */
    public static rpcResult DoPost(String url, Map<String,String> header, String body){
        DefaultHttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);
        //请求头
        if (!header.isEmpty()){
            Set<String> keys = header.keySet();
            for (String key : keys){
                String value = header.get(key);
                post.addHeader(key,value);
            }
        }
        //请求体
        try {
            //设置请求体
            StringEntity entity = new StringEntity(body);
            post.setEntity(entity);
            //发起请求
            HttpResponse response = client.execute(post);
            //判断请求结果
            int code = response.getStatusLine().getStatusCode();
            rpcResult rpcResult = new rpcResult();
            if (code == HttpStatus.SC_OK){
                rpcResult.setCode(code);
                rpcResult.setMsg("请求成功！");
                String jsonStr = EntityUtils.toString(response.getEntity());
                rpcData data = JSON.parseObject(jsonStr,rpcData.class);
                rpcResult.setData(data);
            }else{
                rpcResult.setCode(code);
                rpcResult.setMsg("请求失败！");
                rpcResult.setData(null);
            }
            return rpcResult;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
     return null;
    }
    /**
     * 对字符串进行base64编码处理
     * @param msg
     * @return
     */
    public static String base64Str(String msg){
        return Base64.getEncoder().encodeToString(msg.getBytes(StandardCharsets.UTF_8));
    }

}
