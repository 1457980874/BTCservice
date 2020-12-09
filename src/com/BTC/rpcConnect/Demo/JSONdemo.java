package com.BTC.rpcConnect.Demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class JSONdemo {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="陈皮";
        student.sex="男";
        student.age=19;
        //序列化后的字符串对象
        String stuJson = JSONObject.toJSON(student).toString();
        System.out.println(stuJson);
        //反序列化后的内存中的对象
        Student stu1 = JSONObject.parseObject(stuJson,Student.class);
        System.out.println(stu1.getName());

        //用JsonObject直接生成
        JSONObject jsonObject= new JSONObject();
        jsonObject.put("name","老王");
        jsonObject.put("sex","男");
        jsonObject.put("age","27");
        String jsonString = jsonObject.toJSONString();
        System.out.println(jsonString);
    }
    static class Student {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private String name;
        private String sex;
        private int age;
    }

    public static String Base64Str(String message){
        return Base64.getEncoder().encodeToString(message.getBytes(StandardCharsets.UTF_8));
    }
}
