package com.example.ljw.test;

import android.graphics.Bitmap;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresPermission;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Manifest;

import javax.crypto.SecretKey;

import static android.R.id.list;

public class MainActivity extends AppCompatActivity {

    String josn = "{\"date\":\"20170913\",\"stories\":[{\"images\":[\"https:\\/\\/pic1.zhimg.com\\/v2-afdb15f5f5a23966e886431f3d9555c0.jpg\"],\"type\":0,\"id\":9605101,\"ga_prefix\":\"091312\",\"title\":\"大误 · 把皮卡丘的尾巴拉直会怎么样？\"},{\"images\":[\"http:\\/\\/pic3.zhimg.com\\/d126daba35bcb8f93a86fcd68e77e66a.jpg\"],\"type\":0,\"id\":4589958,\"ga_prefix\":\"091310\",\"title\":\"本来不烫手的水杯，为什么转动一下就感觉很烫了？\"},{\"images\":[\"https:\\/\\/pic1.zhimg.com\\/v2-581a9b24d8fadbabb715e12b50589248.jpg\"],\"type\":0,\"id\":9610192,\"ga_prefix\":\"091309\",\"title\":\"情人总分分合合，但你确定你们真的适合再复合吗？\"},{\"images\":[\"https:\\/\\/pic2.zhimg.com\\/v2-33f38d6598b4f869185d268821badac1.jpg\"],\"type\":0,\"id\":9613411,\"ga_prefix\":\"091308\",\"title\":\"- 医生，我这个手术成功概率有多少？\\r\\n- 谈概率伤感情，我尽力\"},{\"title\":\"iPhone X 和更多新功能发布，万众瞩目之下，苹果交卷了\",\"ga_prefix\":\"091307\",\"images\":[\"https:\\/\\/pic2.zhimg.com\\/v2-4c5c8055a89804b96146065d5e50ea29.jpg\"],\"multipic\":true,\"type\":0,\"id\":9614161},{\"images\":[\"https:\\/\\/pic1.zhimg.com\\/v2-421294b75f3ddab59e02d2569b1e23fc.jpg\"],\"type\":0,\"id\":9454912,\"ga_prefix\":\"091307\",\"title\":\"爱向你承诺「每年有多次加薪机会」的老板，上辈子都是打折的天使\"},{\"images\":[\"https:\\/\\/pic4.zhimg.com\\/v2-cdb56e9f15adbf09b1cb0f30940000bf.jpg\"],\"type\":0,\"id\":9613982,\"ga_prefix\":\"091307\",\"title\":\"所谓的网络爽文，到底是什么地方让人很爽？\"},{\"images\":[\"https:\\/\\/pic2.zhimg.com\\/v2-c9681d8184f4d4deef8af6843a865901.jpg\"],\"type\":0,\"id\":9611855,\"ga_prefix\":\"091307\",\"title\":\"你每次指着菜单点的菜，是不是都叫这些名字？\"},{\"images\":[\"https:\\/\\/pic1.zhimg.com\\/v2-6addc21bd74d2c99eaff0c8e269240b8.jpg\"],\"type\":0,\"id\":9613617,\"ga_prefix\":\"091306\",\"title\":\"瞎扯 · 如何正确地吐槽\"}],\"top_stories\":[{\"image\":\"https:\\/\\/pic4.zhimg.com\\/v2-a08e648383756bd12386dc9f59b3328b.jpg\",\"type\":0,\"id\":9614161,\"ga_prefix\":\"091307\",\"title\":\"iPhone X 和更多新功能发布，万众瞩目之下，苹果交卷了\"},{\"image\":\"https:\\/\\/pic1.zhimg.com\\/v2-114d9ce99bc02f3237182732ac595888.jpg\",\"type\":0,\"id\":9454912,\"ga_prefix\":\"091307\",\"title\":\"爱向你承诺「每年有多次加薪机会」的老板，上辈子都是打折的天使\"},{\"image\":\"https:\\/\\/pic2.zhimg.com\\/v2-06b74de50064bec05344c2fb26fa8c09.jpg\",\"type\":0,\"id\":9611855,\"ga_prefix\":\"091307\",\"title\":\"你每次指着菜单点的菜，是不是都叫这些名字？\"},{\"image\":\"https:\\/\\/pic1.zhimg.com\\/v2-9d1be41e1444c5d108268ca3469bd784.jpg\",\"type\":0,\"id\":9613002,\"ga_prefix\":\"091217\",\"title\":\"「WePhone 创始人自杀，前妻就是敲诈勒索」，这么说还太早了\"},{\"image\":\"https:\\/\\/pic3.zhimg.com\\/v2-4134e37cac9cd5b50da12fff11df4c56.jpg\",\"type\":0,\"id\":9611928,\"ga_prefix\":\"091218\",\"title\":\"冷战后，为什么先开口挽回的那个总是你？\"}]} ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s = "a~";

        Log.i("xyz","原来的字符串 :"+ s);
        try {
            s = MD5Util.MD5Encode(s);
            Log.i("xyz","MD5加密后的字符串 :"+ s);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            JSONObject jsonObject = new JSONObject(josn);

            String  pro = jsonObject.optString("stories");
            Log.i("xyz","sheng = " + pro);

            int  pro1 = jsonObject.optInt("stories");
            Log.i("xyz","sheng1 = " + pro1);

            int  pro2 = jsonObject.optInt("zz");
            Log.i("xyz","sheng2 = " + pro2);

            String pe = jsonObject.optString("zz");
            Log.i("xyz","test = "+pe);

//            这个会出错，打印failed
//            String pe1 = jsonObject.getString("zz");
//            Log.i("xyz","test1 = "+pe1);


            int id = jsonObject.optInt("id");
            Log.i("xyz","id = "+id);


            int id2 = jsonObject.getInt("id");
            Log.i("xyz","id2 = "+id2);


        } catch (JSONException e) {
            e.printStackTrace();
            Log.i("xyz","failed");
        }


        List<String> list = new ArrayList<>();
        list.add("madzz");
        list.add("hhhh");
        Log.i("xyz","this = "+list.toString());
        Log.i("xyz","this = "+ super.toString());
        Log.i("xyz","this = "+ this);

        String a = null;
        say(a);

    }


    private String say(@NonNull String s){
        return "";
    }
}
