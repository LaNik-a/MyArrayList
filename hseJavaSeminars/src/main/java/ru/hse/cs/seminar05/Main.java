package ru.hse.cs.seminar05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<String>();
        System.out.println(list.size());
        for (int i = 0; i < 20; i++) {
            list.put("F"+i);
        }
        System.out.println(list.contains("F0"));
        System.out.println(list.size());
        ArrayList<String> l  = new ArrayList<String>();

    }
}
