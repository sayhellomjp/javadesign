package com.mjp.demo.classloader.demo;

public class Text {
    public static int k = 0;
    public static Text t1 = new Text("t1");
    public static Text t2 = new Text("t2");
    public static int i = print("i");
    public static int n = 99;
    public int j = print("j");

    {
        print("构造块");
    }
    static {
        print("静态块");
    }

    public Text(String str) {
        System.out.println((++k) + ":" + str + "   i=" + i + "    n=" + n);
        ++i;
        ++n;
    }

    public static int print(String str) {
        System.out.println((++k) + ":" + str + "   i=" + i + "    n=" + n);
        ++n;
        return ++i;
    }

    public static void main(String args[]) {
        Text t = new Text("init");
    }
}

//执行main时，先加载所在的类，完成如下动作：声明静态变量，初始化静态变量，执行静态代码块
//1.初始化到t1时，暂停类加载，先实例化t1，此时k=0，i=0，n=0
//2.实例化t1先初始化非静态成员变量j，调用print方法，K自增为1，输出1：j i=0，n=0，然后i和n自增为1
//3.执行构造代码快，k自增为2，输出：2：构造块 i=1，n=1，然后i和n自增为2
//4.执行构造方法，k自增为3，输出：3：t1 i=2，n=2
//5.初始化到t2时，暂停类加载，先实例化，此时k=3，i，n都还未初始化，但已自增为3
//6.初始化j时，k自增为4，i，n未初始化为3，输出“4:j i=3 n=3”，n,i自增为4
//7.执行代码块，输出“5:构造块 i=4 n=4”，n,i自增为5
//8.执行构造函数，输出“6:t2 i=5 n=5”，n,i自增为6
//9.初始化i，输出“7:i i=6 n=6”，n,i自增为7，返回自增后的i赋值给i
//10.初始化n，赋值99
//11.执行静态块，输出“8:静态块 i=7 n=99”，i自增为8，n自增为100
//完成类加载，执行Text t = new Text("init");
//初始化成员变量j，输出9:j   i=8    n=100
//调用构造块和构造方法，输出 10:构造块   i=9    n=101
//                       11:init   i=10    n=102
