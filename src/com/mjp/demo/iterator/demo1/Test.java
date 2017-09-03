package com.mjp.demo.iterator.demo1;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();

        User user1 = new User("mjp", "123");
        User user2 = new User("rtt", "456");
        list.add(user1);
        list.add(user2);

        Map m = new HashMap();

        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            System.out.println(user.getName());
        }
    }

}
