package com.mjp.demo.innerclass;

public class TestClass2 {

    //局部内部类定义于方法内部，可以将返回值定义一个超类或者接口，让局部内部类继承他，通过超类来调用被子类重写的方法。
    public People operation(String str){
        //可以通过继承或者实现接口实现
        class Man extends People {
            private String name;
            private Man(String name){
                this.name = name;
            }
            public String readName(){
                return name;
            }
        }
        return new Man(str);
    }

    //局部内部类定义于作用域内
    public String testMethod(){
        String result = "";
        if(true){
            class Woman {
                private String sex = "女";
                public String getSex(){
                    return this.sex;
                }
            }
            Woman woman = new Woman();
            result = woman.getSex();
        }
        return result;
    }


    public static void main(String[] args) {
        TestClass2 out = new TestClass2();
        People people = out.operation("majunpeng");
        System.out.println(people.readName());

        System.out.println(out.testMethod());
    }

}
