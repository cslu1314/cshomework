import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
        System.out.println("请输入要打印的行数：");
        Scanner sc = new Scanner(System.in);
        int line = Integer.parseInt(sc.next());
        printStar(line);
    }

    public static void printStar(int n) {
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
