package work03;

/**
 * @author zhchch
 * @date 2021/10/19 19:54
 */
public class Demo {
    public static void main(String[] args) {
        Integer value = new Integer("1");
        System.out.println("value = " + value);
        System.out.println("-----------调用changeWrapClass(value)：----------");
        changeWrapClass(value);
        System.out.println("--------after调用changeWrapClass(value)：-------");
        System.out.println("value = " + value);
    }

    public static Integer changeWrapClass(Integer value) {
        value = value + 2;
        System.out.println("value = " + value);
        return value;
    }
}
