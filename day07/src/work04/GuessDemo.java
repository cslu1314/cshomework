package work04;

import java.util.Scanner;

/**
 * @author zhchch
 * @date 2021/10/15 9:26
 */
public class GuessDemo {
    public static void main(String[] args) {

        //Math.random()方法获取一个0~1的小数，左闭右开[0,1)
        //guessNum的范围是[1,100]
        int guessNum = (int) (Math.random() * 100) + 1;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("请输入一个1~100之间的数字：");
            int num = Integer.parseInt(sc.next());
            if (num > guessNum) {
                System.out.println("大了！");
            } else if (num < guessNum) {
                System.out.println("小了！");
            } else {
                System.out.println("你猜对了！");
                flag = false;
            }
        }
    }
}
