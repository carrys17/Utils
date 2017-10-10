package com.example.ljw.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by ljw on 17/9/21.
 */

public class ModifyArrayList {

    public static void main(String [] args){

        Random random = new Random(47);
        Integer[] integers = {1,2,34,2,1,4,68,42,58,36,21};
        List<Integer> list1 = new ArrayList<>(Arrays.asList(integers));
        System.out.println("before: "+ list1);
        Collections.shuffle(list1,random);
        System.out.println("after: "+list1);
        System.out.println("array: "+Arrays.toString(integers));

        System.out.println();

        List<Integer> list2 = Arrays.asList(integers);
        System.out.println("before: "+ list2);
        Collections.shuffle(list2,random);
        System.out.println("after: "+list2);
        System.out.println("array: "+Arrays.toString(integers));

    }
}
