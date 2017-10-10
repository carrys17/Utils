package com.example.ljw.test;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class MD5Util {





    @Override
    public String toString() {
       return super.toString();
//        return "mdzz"+this;

    }

    public static void main(String[] args) throws Exception {
//        String string = "07cf0692548c25fb5b4499ab4e52fc11#464f308bda039692d3ac01d9b3e25dfd";
//        String data = MD5Encode(string);
//        System.out.println("MD5结果:"+data);
//        System.out.println("原文:"+string);


        MD5Util list = new MD5Util();
//        Log.i("xyz"," result = "+list);
        System.out.println(list);


        String ca = "abcdefghijklmn";
        System.out.println(ca);

        char[] ca2 = new char[50];
        ca.getChars(2,14,ca2,5);
        System.out.println(ca2);

        String s2 = ca.substring(2,14);
        System.out.println(s2);



        String com = "a";
        String com2 = "B";
        int res = com.compareTo(com2);
        System.out.println("res = "+ res);


        String comw = "a";
        String comw2 = "A";
        int resw = comw.compareTo(comw2);
        System.out.println("resw = "+ resw);


        String phone = "13112345678";
        boolean isphone = RegexUtils.isPhoneNumber(phone);
        System.out.println(phone+" is a phonenumber ?  ---- "+ isphone);


        String username = "ai9zs2111111";
        boolean isusername = RegexUtils.isUsername(username);
        System.out.println(username+" is a username ?  ---- "+ isusername);

        String mail = "carrys17@gmail.com";
        boolean ismail = RegexUtils.isMail(mail);
        System.out.println(mail +" is a mail ? ----- "+ismail);



        List<List<String>> fatherList = new LinkedList<>();
        List<String> childList = new ArrayList<>();
        childList.add("before");
        fatherList.add(childList);
        childList.add("after");
        System.out.println("father ------> "+ fatherList.toString());



        String ss1 = "hello";
        String ss2 = "byebye";
        System.out.println(ss1 + "----" +ss2); // System.out.println(ss1 + "----" +ss2);
        change(ss1,ss2);
        System.out.println(ss1 + "----" +ss2); // System.out.println(ss1 + "----" +ss2);


        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("byebye");
        System.out.println(sb1 + "----" + sb2); // hello----byebye
        change(sb1,sb2);
        System.out.println(sb1 + "----" + sb2); // hello----byebyebyebye


        Person person = new Person();
        person.age = 10;
        System.out.println("age = "+person.age);

        change(person);

        System.out.println("age = "+person.age);


        String s = "我们";

        int i = s.length();  // 2

        int j = s.getBytes("gbk").length;  // 4

        int k = s.getBytes("utf-8").length; // 6

        int l = s.getBytes().length; // 6

        System.out.println(i+" "+j+" "+k+" "+l);




    }





    public static void change(Person person){
        person = new Person();
        person.age = 18;
    }


    public static void change(String ss1,String ss2){
        ss1 = ss2;
        ss2 = ss1 + ss2;
    }

    public static void change(StringBuffer sb1, StringBuffer sb2){
        sb1 = sb2;
        sb2 = sb2.append(sb1);
    }



	
	public static String MD5Encode(String inStr) throws Exception {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }

        byte[] byteArray = inStr.getBytes("UTF-8");
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
}
