import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteRepetition {
    public static void main(String[] args) {
        System.out.println("请输入10个数字：");
        Scanner sc = new Scanner(System.in);
        int[] arrs = new int[10];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = Integer.parseInt(sc.next());
        }
        System.out.println("得到的数组是：");
        System.out.println(Arrays.toString(arrs));

        System.out.println("请输入要删除的数字：");
        int target = Integer.parseInt(sc.next());
        System.out.println("删除后得到的数组是：");
        System.out.println(Arrays.toString(deleteDuplicate(arrs, target)));
    }

    public static int[] deleteDuplicate(int[] arrs, int target) {
        int sum = 0;
        for (int arr : arrs) {
            if (arr == target) {
                sum++;
            }
        }
        int[] arrs1 = new int[arrs.length - sum];
        for (int i = 0, j = 0; i < arrs.length; i++) {
            if (arrs[i] != target) {
                arrs1[j] = arrs[i];
                j++;
            }
        }
        return arrs1;
    }
}
