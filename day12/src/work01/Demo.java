package work01;

import java.util.Scanner;

/**
 * @author zhchch
 * @date 2021/10/16 14:24
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("===========无返回值无参数的功能接口============");
        INoReturnNoParam iNoReturnNoParam = () -> System.out.println("hello lambda!");
        iNoReturnNoParam.test();
        INoReturnNoParam iNoReturnNoParam1 = System.out::println;
        iNoReturnNoParam1.test();

        System.out.println("============无返回值有一个参数的功能接口===========");
        INoReturnOneParam iNoReturnOneParam = a -> System.out.println(a);
        iNoReturnOneParam.test(1);
        INoReturnOneParam iNoReturnOneParam1 = System.out::println;
        iNoReturnOneParam1.test(2);

        System.out.println("============无返回值两个参数的功能接口============");
        INoReturnTwoParam iNoReturnTwoParam = (a, b) -> {
            System.out.println("hello lambda!");
            System.out.println(a + "+" + b + "=" + (a + b));
        };
        iNoReturnTwoParam.test(2, 3);
        INoReturnTwoParam iNoReturnTwoParam1 = Demo::noReturnTwoParam;
        iNoReturnTwoParam1.test(3, 5);

        System.out.println("==================有返回值无参数的功能接口=================");
        new Demo().testHasReturnNoParam(() -> {
            System.out.println("hello lambda, hasReturnNoParam");
            return -1;
        });
        new Demo().testHasReturnNoParam(new Demo()::hasReturnNoParam);

        System.out.println("==================有返回值一个参数的功能接口===============");
        IHasReturnOneParam iHasReturnOneParam = a -> {
            System.out.println("hello lambda, hasReturnOneParam");
            return a + 1;
        };
        int method = iHasReturnOneParam.method(8);
        System.out.println(method);
        System.out.println("==================有返回值两个参数的功能接口===============");
        new Demo().testHasReturnTwoParam(new Demo()::hasReturnTwoParam);
    }

    public static void noReturnTwoParam(int c, int d) {
        System.out.println("static: hello lambda!");
        System.out.println(c + "+" + d + "=" + (d + c));
    }

    private int hasReturnNoParam() {
        System.out.println("hasReturnNoParam");
        return 1;
    }

    public void testHasReturnNoParam(IHasReturnNoParam iHasReturnNoParam) {
        int test = iHasReturnNoParam.test();
        System.out.println(test);
    }

    public void testHasReturnTwoParam(IHasReturnTwoParam iHasReturnTwoParam) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("请输入第二个整数：");
        int b = Integer.parseInt(sc.nextLine());
        int test = iHasReturnTwoParam.test(a, b);
        System.out.println(test);
    }

    public int hasReturnTwoParam(int a, int b) {
        System.out.println("hello lambda, hasReturnTwoParam");
        return (a + b);
    }

}

//无返回值无参数的功能接口
@FunctionalInterface
interface INoReturnNoParam {
    void test();
}

//无返回值有一个参数的功能接口
@FunctionalInterface
interface INoReturnOneParam {
    void test(int a);
}

//无返回值两个参数的功能接口
@FunctionalInterface
interface INoReturnTwoParam {
    void test(int a, int b);
}

//有返回值无参数的功能接口
@FunctionalInterface
interface IHasReturnNoParam {
    int test();
}

//有返回值一个参数的功能接口
@FunctionalInterface
interface IHasReturnOneParam {
    int method(int a);
}

//有返回值两个参数的功能接口
@FunctionalInterface
interface IHasReturnTwoParam {
    int test(int a, int b);
}