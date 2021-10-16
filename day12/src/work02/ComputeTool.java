package work02;

/**
 * @author zhchch
 * @date 2021/10/16 15:27
 */
public class ComputeTool {
    private ComputeTool() {
    }

    public static void calc(Compute com, double a, double b) {
        com.compute(a, b);
    }
}

class Demo {
    public static void main(String[] args) {
        ComputeTool.calc(new Computer()::sum, 3, 4);
        ComputeTool.calc(new Computer()::sub, 5, 6);
        ComputeTool.calc(new Computer()::mul, 7, 8);
        ComputeTool.calc(new Computer()::div, 9, 10);

    }
}

@FunctionalInterface
interface Compute {
    void compute(double a, double b);
}

class Computer {
    void sum(double a, double b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    void sub(double a, double b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    void mul(double a, double b) {
        System.out.println(a + " × " + b + " = " + (a * b));
    }

    void div(double a, double b) {
        System.out.println(a + " ÷ " + b + " = " + (a / b));
    }
}
