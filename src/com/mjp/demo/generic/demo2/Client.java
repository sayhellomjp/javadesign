package com.mjp.demo.generic.demo2;

public class Client {

    public static void main(String[] args) {
        String[] arrays = {"mjp", "rtt", "mjprtt"};
        StackDemo<String> stackDemo = new StackDemo<String>();
        for(String str: arrays){
            stackDemo.push(str);
        }

        while(!stackDemo.isEmpty()){
            System.out.println(stackDemo.pop().toUpperCase());
        }
    }

}
