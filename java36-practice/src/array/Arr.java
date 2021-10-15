package array;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] arr = new int[]{};
        int[] arr2 = new int[]{2, 3, 4};
        arr2 = new int[]{3, 3};
        System.out.println(Arrays.toString(arr2));
        System.out.println("==========");
        String[] a = new String[3];
        String[] b;
//        System.out.println(b);
        System.out.println(Arrays.toString(a));

        System.out.println("==---------");
        int[] arr3 = null ;
        System.out.println(arr3);
    }
}
