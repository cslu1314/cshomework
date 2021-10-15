import java.util.Arrays;

public class DivTwo {
    public static void main(String[] args) {
        double[] arrs = new double[]{2, 4, 6, 4};
        System.out.println(Arrays.toString(arrs));
        System.out.println("=========================");
        getHalfValue(arrs);
        System.out.println(Arrays.toString(arrs));
    }

    public static double[] getHalfValue(double[] arrs) {
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = arrs[i] / arrs[0];
        }
        return arrs;
    }
}
