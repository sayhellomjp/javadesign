public class Main {

    {
        System.out.println("构造代码块");
    }

    public Main(){
        System.out.println("构造函数1");
    }

    public Main(String test){
        System.out.println("构造函数2");
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
