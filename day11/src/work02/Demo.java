package work02;

/**
 * @author zhchch
 * @date 2021/10/15 21:35
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("使用实现类进行测试");
        Compute compute = new Computer();
        compute.sum(1, 1);
        compute.sub(1, 2);
        compute.mul(1, 3);
        compute.div(4, 2);


        class Computer1 implements Compute {
            @Override
            public void sum(double a, double b) {
                System.out.println(a + "+" + b + " = " + (a + b));
            }

            @Override
            public void sub(double a, double b) {
                System.out.println(a + "-" + b + " = " + (a - b));
            }

            @Override
            public void mul(double a, double b) {
                System.out.println(a + "×" + b + " = " + (a * b));
            }

            @Override
            public void div(double a, double b) {
                System.out.println(a + "÷" + b + " = " + (a / b));
            }
        }
        System.out.println("使用局部内部类进行测试");
        Compute compute1 = new Computer1();
        compute1.sum(1, 3);
        compute1.sub(1, 3);
        compute1.mul(1, 3);
        compute1.div(4, 3);


        Compute compute2 = new Compute() {
            @Override
            public void sum(double a, double b) {
                System.out.println(a + "+" + b + " = " + (a + b));
            }

            @Override
            public void sub(double a, double b) {
                System.out.println(a + "-" + b + " = " + (a - b));
            }

            @Override
            public void mul(double a, double b) {
                System.out.println(a + "×" + b + " = " + (a * b));
            }

            @Override
            public void div(double a, double b) {
                System.out.println(a + "÷" + b + " = " + (a / b));
            }
        };
        System.out.println("使用匿名内部类的方式：f");
        compute2.sum(1, 3);
        compute2.sub(1, 3);
        compute2.mul(1, 3);
        compute2.div(4, 3);
    }

}

interface Compute {
    void sum(double a, double b);

    void sub(double a, double b);

    void mul(double a, double b);

    void div(double a, double b);
}

//编写实现类进行测试
class Computer implements Compute {
    @Override
    public void sum(double a, double b) {
        System.out.println(a + "+" + b + " = " + (a + b));
    }

    @Override
    public void sub(double a, double b) {
        System.out.println(a + "-" + b + " = " + (a - b));
    }

    @Override
    public void mul(double a, double b) {
        System.out.println(a + "×" + b + " = " + (a * b));
    }

    @Override
    public void div(double a, double b) {
        System.out.println(a + "÷" + b + " = " + (a / b));
    }
}