package work01;

import java.util.Scanner;

/**
 * @author zhchch
 * @date 2021/10/20 15:11
 */
public class Demo {
    public static void main(String[] args) {
        int anInt = ScannerUtil.getInt();
        System.out.println("你刚才输入的数字是：" + anInt);
    }

}

class ScannerUtil {
    private static Scanner sc = new Scanner(System.in);

    private ScannerUtil() {
    }

    public static int getInt() {
        int value;

        while (true) {
            System.out.println("请输入一个整数：");
            try {
                value = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("输入有误，请重新输入！");
                continue;
            }
            break;
        }
        return value;
    }

}
