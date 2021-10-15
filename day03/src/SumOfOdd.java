/**
 * 使用for循环遍历100以内的奇数，并计算所有的奇数的和并输出
 */
public class SumOfOdd {
    public static void main(String[] args) {
        System.out.println("100以内的奇数和是：" + getSum(100));
    }

    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
