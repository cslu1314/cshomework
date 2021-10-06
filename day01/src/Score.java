import java.util.Scanner;

/**
 * 键盘输入某个学生的三门学科（数学，语文，英语）成绩，然后分别求出三科成绩的平均分，最低分，最高分，三科的总分
 */
public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数学成绩：");
        int math = sc.nextInt();
        System.out.println("请输入语文成绩：");
        int chinese = sc.nextInt();
        System.out.println("请输入英语成绩：");
        int english = sc.nextInt();
        System.out.println("三门成绩的平均分是：" + (math + chinese + english) / 3.0);
        int min = math < chinese ? (math < english ? math : english) : (chinese < english ? chinese : english);
        System.out.println("三门成绩单最低分是：" + min);
        int max = math > chinese ? (math > english ? math : english) : (chinese > english ? chinese : english);
        System.out.println("三门成绩单最高分是：" + max);
        System.out.println("三门成绩的总分是：" + (chinese + math + english));
    }
}
