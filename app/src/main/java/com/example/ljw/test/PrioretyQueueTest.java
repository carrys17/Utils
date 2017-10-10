package com.example.ljw.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Created by ljw on 17/9/20.
 */

public class PrioretyQueueTest {


    public static void main(String[] args) {

        //
        PriorityQueue<Integer> queue =  new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0;i<10;i++){
            queue.offer(random.nextInt(i+10));
        }
        while (!queue.isEmpty()){
            System.out.print(queue.poll() + ",");
        }
        System.out.println();

        // 正序
        List<Integer> ints  = new ArrayList<>();
        ints.add(new Integer(1));
        ints.add(new Integer(12));
        ints.add(new Integer(13));
        ints.add(new Integer(31));
        ints.add(new Integer(14));
        ints.add(new Integer(13));
        ints.add(new Integer(251));
        ints.add(new Integer(153));
        PriorityQueue<Integer> queue1 = new PriorityQueue<>(ints);
        while (!queue1.isEmpty()){
            System.out.print(queue1.poll() + ",");
        }
        System.out.println();

        // 反序
        List<Integer> ints2  = new ArrayList<>();
        ints2.add(new Integer(1));
        ints2.add(new Integer(12));
        ints2.add(new Integer(13));
        ints2.add(new Integer(31));
        ints2.add(new Integer(14));
        ints2.add(new Integer(13));
        ints2.add(new Integer(251));
        ints2.add(new Integer(153));
        PriorityQueue<Integer> queue2 = new PriorityQueue<>(ints2.size(),Collections.<Integer>reverseOrder());  // 关键点，先置为反序
        queue2.addAll(ints2);  // 再把数据放入队列
        while (!queue2.isEmpty()){
            System.out.print(queue2.poll() + ",");
        }
        System.out.println();

    }
}
