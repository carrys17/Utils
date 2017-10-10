package com.example.ljw.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by ljw on 17/9/20.
 */

public class Test {

    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String,String> map){
        map.put("rat","Fuzzy");
        map.put("cat","Rags");
        map.put("dog","Bosco");
        map.put("dog","Spot");
        return map;
    }

    public static void main(String[] args){
        // List  从输出可以看出它们都是按插入的顺序保存元素的
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println();

        // Set 元素不能重复，所以只有一个dog
        System.out.println(fill(new HashSet<String>()));  // HashSet。目前只知道它是最快的获取元素方式，这里虽然是正序的，但是书里的输出是倒序的，而且说到它是没有按照任何明显的顺序来保存元素
        System.out.println(fill(new TreeSet<String>()));  // TreeSet。是按照比较结果的升序来保存对象的
        System.out.println(fill(new LinkedHashSet<String>())); // LinkedHashSet。按照插入的顺序来保存的。
        System.out.println();

        // Map是key-value的形式的
        System.out.println(fill(new HashMap<String, String>())); // HashMap。同样的跟HashSet一样提供最快的查找技术，也没有按照任何明显的顺序来保存元素
        System.out.println(fill(new TreeMap<String, String>())); // TreeMap。按照比较结果的升序来保存键
        System.out.println(fill(new LinkedHashMap<String, String>())); // LinkedHashMap。按照插入的顺序保存键，同时还保留了HashMap的查询速度


    }
}
