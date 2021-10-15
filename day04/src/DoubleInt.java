public class DoubleInt {
    public static void main(String[] args) {
        Integer value1 = 1;
        Integer value2 = 2;
        System.out.println("value1 = " + value1 + ", value2 = " + value2);

        System.out.println("=======================================");
        getDoubleInt(value1, value2);
        System.out.println("value1 = " + value1 + ", value2 = " + value2);
    }

    public static void getDoubleInt(Integer value1, Integer value2) {
        value1 = value1 * 20;
        value2 = value2 * 20;
        System.out.println("value1 = " + value1 + ", value2 = " + value2);
        System.out.println("=======================================");
    }
}
