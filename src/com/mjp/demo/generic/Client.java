package com.mjp.demo.generic;

public class Client {

    public static void main(String[] args) {
        TestGeneric<String, Boolean> obj1 = new TestGeneric<String, Boolean>();
        obj1.setData1("123");
        obj1.setData2(true);

        System.out.println(obj1.getData1());
        System.out.println(obj1.getData2());

        System.out.println("------------");

        TestGeneric<User, User> obj2 = new TestGeneric<User, User>();
        User user1 = new User("majunpeng", 26);
        User user2 = new User("rentingting", 27);
        obj2.setData1(user1);
        obj2.setData2(user2);

        System.out.println(obj2.getData1().getName());

        System.out.println("------------");

        Client.test(1, "23");
    }

    public static <T1, T2> void test(T1 t1, T2 t2){
        T1 v1 = t1;
        T2 v2 = t2;
        System.out.println("v1:" + v1 + " v2:" + v2);

    }

}
