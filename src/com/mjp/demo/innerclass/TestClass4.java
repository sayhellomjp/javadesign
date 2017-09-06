package com.mjp.demo.innerclass;

public class TestClass4 {

    private static int a;
    private int b;

    public void test(final int c, int z) {
        final int d = 1;
        class Inner {
            public void print() {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
            }
        }

        //如果想在外部得到该内部类，必须继承或者实现一个现有的类或接口，并且返回new Inner2();
        class Inner2 extends People{

            @Override
            public String readName() {
                return null;
            }

            public People getInner2(){
                return new Inner2();
            }
        }
    }

    public static void testStatic(final int c) {
        final int d = 1;
        class Inner {
            public void print() {
                System.out.println(a);
                //定义在静态方法中的局部类不可以访问外部类的实例变量
                //System.out.println(b);
                System.out.println(c);
                System.out.println(d);
            }
        }
    }
}
