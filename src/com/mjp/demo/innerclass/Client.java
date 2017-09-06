package com.mjp.demo.innerclass;

public class Client {

    public static void main(String[] args) {
        People people = new People() {
            @Override
            public String readName() {
                return "lalala";
            }
        };
        System.out.println(people.readName());

        Super s = new Super(){
            @Override
            public void test1() {
                System.out.println("sonClass");
            }
        };
        s.test1();
        Client client = new Client();
        client.test(s);

    }

    public void test(Super superClass){
        superClass.test1();
    }

}
