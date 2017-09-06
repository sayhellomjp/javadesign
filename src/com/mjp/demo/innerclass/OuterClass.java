package com.mjp.demo.innerclass;

public class OuterClass {

    private String name = "mjp";
    private int age = 26;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //成员内部类
    public class InnerClass {
        private String innerName = "inner";
        public void display(){
            System.out.println(OuterClass.this.age);
            System.out.println("name:" + name + " age:" + age + " innerName:" + this.innerName);
        }

        public OuterClass getOut(){
            return OuterClass.this;
        }
    }

    /*推荐使用getxxx()来获取成员内部类，尤其是该内部类的构造函数无参数时 */
    public InnerClass getInnerClass(){
        return new InnerClass();
    }


    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();
        System.out.println(innerClass.getOut().getName());
    }

}
