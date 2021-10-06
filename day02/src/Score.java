import java.util.Scanner;

/**
 * 键盘输入某个学生的三门学科（数学，语文，英语）成绩，然后分别求出三科成绩的平均分，最低分，最高分，三科的总分
 */
public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double math, chinese, english;
        System.out.println("请分别输入数学分数：");
        math = Double.parseDouble(sc.next());
        System.out.println("请分别输入语文分数：");
        chinese = Double.parseDouble(sc.next());
        System.out.println("请分别输入英语分数：");
        english = Double.parseDouble(sc.next());

        double aveScore, minScore, maxScore, totalScore;
        aveScore = getAveScore(math, chinese, english);
        minScore = getMinScore(math, chinese, english);
        maxScore = getMaxScore(math, chinese, english);
        totalScore = getTotalScore(math, chinese, english);
        System.out.println("平均分是：" + aveScore
                + "\n最低分是：" + minScore
                + "\n最高分是：" + maxScore
                + "\n总分是：" + totalScore);
    }

    private static double getTotalScore(double math, double chinese, double english) {
        return math + chinese + english;
    }

    private static double getMaxScore(double math, double chinese, double english) {
        return math > chinese ? (math > english ? math : english) : (chinese > english ? chinese : english);
    }

    private static double getMinScore(double math, double chinese, double english) {
        return math < chinese ? (math < english ? math : english) : (chinese < english ? chinese : english);
    }

    private static double getAveScore(double math, double chinese, double english) {
        return (math + chinese + english) / 3.0;
    }

}
