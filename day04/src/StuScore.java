import java.util.Scanner;

public class StuScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入10位同学的成绩：");
        double[] scores = new double[10];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Double.parseDouble(sc.next());
        }
        System.out.println("10位同学的平均成绩是：" + getAveScore(scores));

    }

    public static double getAveScore(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}
