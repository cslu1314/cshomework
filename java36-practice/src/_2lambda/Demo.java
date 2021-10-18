package _2lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhchch
 * @date 2021/10/17 23:02
 */
public class Demo {
    @Test
    public void test() {
        Runnable runnable = () -> System.out.println("hello lambda!");
        runnable.run();
    }

    @Test
    public void test1() {
        List<Integer> lists = Arrays.asList(3, 3, 5, 53, 6, 665, 46, 34, 62, 6, 26, 24, 62, 6, 426);
        lists.stream().sorted().forEach(System.out::println);

    }

    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
