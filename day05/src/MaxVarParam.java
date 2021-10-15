import java.util.Arrays;

public class MaxVarParam {
    public static void main(String[] args) {
        double[] arrs = {0.0, 6.5, 5.4, 9.8, 4.6};
        System.out.println(Arrays.toString(arrs));
        System.out.println("最大值是：" + getMaxValue(arrs));
        System.out.println("==============================");
        double[] arrs1 = {9.9, 6.5, 3.2, 4.5, 1.5, 8.9, 9.2, 4.7, 6.1};
        System.out.println(Arrays.toString(arrs1));
        System.out.println("最大值是：" + getMaxValue(arrs1));
    }

    public static double getMaxValue(double... arrs) {
        double max = Double.NEGATIVE_INFINITY;  //无穷小
        for (double arr : arrs) {
            if (arr > max) {
                max = arr;
            }
        }
        return max;
    }
}
