package com.BTC.rpcConnect.Demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class JsonArrayDemo {
    public static void main(String[] args) {
        school school1=new school();
        school1.name="实验小学";
        school1.num="学校1000人";
        List<String> sc1 = new ArrayList<String>();

        school school2=new school();
        school2.name="中心小学";
        school2.num="学校1500人";
        List<String> sc2 = new ArrayList<String>();

        List<school> schoolList = new ArrayList<school>();
        schoolList.add(school1);
        schoolList.add(school2);

        JSONArray jsonArray = new JSONArray();//创建jsonarray对象
        jsonArray.addAll(schoolList);//添加数据
        System.out.println("名字:"+((school)jsonArray.get(0)).getName());
        System.out.println("人数:"+((school)jsonArray.get(0)).getNum());

        //字符串输出
        String jsonStr = jsonArray.toJSONString();
        System.out.println(jsonStr);

        //转成List
        schoolList  = JSON.parseArray(jsonStr,school.class);
        System.out.println(schoolList);
    }

    static class Classes {
        private String name;
        private int num;//人数
    }

    /**
     * {
     *     "name":"江西软件职业技术大学",
     *     "num":5000,
     *     "classes":[
     *         {
     *             "name":"C190603班",
     *             "num":51
     *             "persons":[
     *                  {
     *                      "name",
     *                      "g
     *                  }
     *             ]
     *         },
     *         {
     *             "name:"C190604班",
     *             "num":50
     *         }
     *     ]
     * }
     */
    static class school{
        private String name;
        private String num;//人数
        private List<Classes> classes;//多少个班级

        public java.util.List<String> getSc() {
            return sc;
        }

        public void setSc(java.util.List<String> sc) {
            this.sc = sc;
        }

        private java.util.List<String> sc;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNum() {
            return num;
        }

        public void setNum(String num) {
            this.num = num;
        }


    }

    public  static byte[] mergeBytes(byte[] data1,byte[] data2){
        byte[] data3=new byte[data1.length+data2.length];
        System.arraycopy(data1,0,data3,0,data1.length);
        System.arraycopy(data2,0,data3,data1.length,data2.length);
        return data3;
    }
}
