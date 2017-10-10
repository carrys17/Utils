package com.example.ljw.test;

import java.util.LinkedList;

/**
 * Created by ljw on 17/9/20.
 */

public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();

    public void push(T v){
        storage.addFirst(v);
    }

    public T peek(){
        return storage.getFirst();
    }

    public T pop(){
        return storage.removeFirst();
    }

    public boolean isEmpty(){
        return storage.isEmpty();
    }

    public String toString(){
        return storage.toString();
    }


}
