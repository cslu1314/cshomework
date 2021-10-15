package work3;

/**
 * @author zhchch
 * @date 2021/10/15 9:08
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 4, 6, 9, 3, 8, 7};
        System.out.println("遍历数组");
        ArrayTool.traverse(arr);
        System.out.println("数组的最大值是：");
        System.out.println(ArrayTool.getArrayMaxValue(arr));
        System.out.println("数组的最小值是：");
        System.out.println(ArrayTool.getArrayMinValue(arr));

        System.out.println("3 第一次出现的下标是：");
        System.out.println(ArrayTool.retrieveFirst(arr, 3));

        System.out.println("3 最后一次出现的下标是：");
        System.out.println(ArrayTool.retrieveLast(arr, 3));
    }
}


class ArrayTool {
    private ArrayTool() {
    }

    //遍历数组
    //if数组是否长度为0 长度为0输出[]
    public static void traverse(int[] arr) {
        if (arr == null) {
            System.out.println("您输入的数据有误,请输入一个正确的数组!");
            return;
        }

        if (arr.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //最后一个元素不应该加逗号
            //if当前元素是否是最后一个元素
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }


    //求数组中元素的最大值
    public static int getArrayMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //求数组中元素的最小值
    public static int getArrayMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //逆置数组
    public static void reverse(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }


    //查找某元素，输出它在数组中第一次出现的下标，输出-1表示该元素在数组中不存在
    public static int retrieveFirst(int[] arr, int targetValue) {
        int targetIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetValue) {
                return i;
            }
        }
        return targetIndex;
    }

    //查找某元素，输出它在数组中最后一次出现的下标，输出-1表示该元素在数组中不存在
    public static int retrieveLast(int[] arr, int targetValue) {
        int targetIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetValue) {
                targetIndex = i;
            }
        }
        return targetIndex;
    }
}
