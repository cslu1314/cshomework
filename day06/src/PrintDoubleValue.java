public class PrintDoubleValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a, b); //请自己写一个方法，输出“a = 100 , b = 200”
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void method(int a, int b) {
        System.out.println("a = " + getDoubleValue(a));
        System.out.println("b = " + getDoubleValue(b));
        System.exit(0);
    }

    private static int getDoubleValue(int a) {
        return a * 2;
    }
}
