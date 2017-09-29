package com.mjp.demo.test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Client {

    public static void main(String[] args) {
        Person person1 = new Person("majunpeng", 26);
        Person person2 = new Person("majunpeng", 26);

        Set<Person> set = new HashSet<Person>();
        set.add(person1);
        set.add(person2);

        System.out.println(person1 == person2);
        System.out.println(set.size());

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
        linkedList.add("f");
        linkedList.add("g");
        linkedList.add("h");
        linkedList.add("i");

        linkedList.remove(5);
    }

}
