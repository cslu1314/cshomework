package _final;

/**
 * @author zhchch
 * @date 2021/10/14 21:31
 */
public class Demo {
    //显式赋值
//    final int a = 10;
//    final int b = 11;
//    final int c = 12;

    //构造代码块赋值
//    final int a ;
//    final int b ;
//    final int c;
//    {
//        a = 10;
//        b = 11;
//        c = 12;
//    }

    //构造方法赋值
    final int a;
    final int b;
    final int c;

    public Demo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    //显式赋值
    final static int staticA = 10;
    final static int staticB = 11;


    //静态代码块赋值
//    final static int staticA;
//    final static int staticB;
//    static {
//        staticA = 10;
//        staticB = 11;
//    }
}
