import java.util.Scanner;

public class JudgesScore {
    public static double getSumScore(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum;
    }

    public static double getMaxScore(double[] scores) {
        double maxScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }
        return maxScore;
    }

    public static double getMinScore(double[] scores) {
        double minScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < minScore) {
                minScore = scores[i];
            }
        }
        return minScore;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请10位评委打分：：");
        double[] scores = new double[10];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请第" + (i + 1) + "位评委打分");
            scores[i] = Double.parseDouble(sc.next());
        }
        System.out.println("===============================");
        System.out.println("去掉一个最高分：" + getMinScore(scores));
        System.out.println("===============================");
        System.out.println("去掉一个最低分：" + getMaxScore(scores));
        System.out.println("===============================");
        System.out.println("最终的平均分是："
                + (getSumScore(scores) - getMaxScore(scores) - getMinScore(scores)) / (scores.length - 2));

    }
}
