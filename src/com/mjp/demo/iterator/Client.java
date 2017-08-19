package com.mjp.demo.iterator;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("mjp");
        aggregate.add("rtt");
        aggregate.add("majunpeng");
        aggregate.add("rentingting");
        aggregate.add("ooo");
//        aggregate.add("uuu");

        Iterator iterator = aggregate.iterator();
        while(iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }

    }

}
