package com.mjp.demo;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

//        List<String> list = new ArrayList<String>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        list.add("5");
//        list.add("6");
//
//        List<String> subList = list.subList(2, 4);//3,4
//        for(String s: subList){
//            System.out.println(s);
//        }
//
//        subList.add("test");
//        System.out.println("success");

        List arrayList1 = new ArrayList();
        List arrayList2 = new ArrayList();

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        System.out.println("i1对比i2：" + (i1 == i2));

        Integer i3 = Integer.valueOf(80);
        Integer i4 = Integer.valueOf(80);
        System.out.println("i3对比i4：" + (i3 == i4));

        char[] c1 = {'a', 'b', 'c'};
        char[] c2 = new char[]{'a', 'b', 'c'};
        char[] c3 = new char[3];
        c3[0] = 'a';
        c3[1] = 'b';
        c3[2] = 'c';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

}
