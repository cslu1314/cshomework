import java.util.Scanner;

public class PrintSharp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入行数：");
            int row = Integer.parseInt(sc.next());
            System.out.println("请输入列数：");
            int line = Integer.parseInt(sc.next());
            printSharp(row, line);
            System.out.println("=====================");
            printForm(line);
            System.out.println();
        }
    }

    private static void printForm(int line) {
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "×" + j + "=" + (i * j) + "      ");
            }
            System.out.println();
        }
    }

    private static void printSharp(int row, int line) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < line; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }


}
