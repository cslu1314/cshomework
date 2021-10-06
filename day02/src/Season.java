import java.util.Scanner;

/**
 * 利用switch语句输出每个月份对应的季节
 * <p>
 * - 12，1，2 — 冬季
 * - 3，4，5 — 春季
 * - 6，7，8 —夏季
 * - 9，10，11 —秋季
 */
public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        while (true) {
            System.out.println("请输入月份：");
            month = Integer.parseInt(sc.next());
            System.out.println(month + "对应的季节是：" + getSeason(month));
        }
    }

    public static String getSeason(int month) {
        String season = "输入月份有误！";
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "冬季";
                break;
            case 3:
            case 4:
            case 5:
                season = "春季";
                break;
            case 6:
            case 7:
            case 8:
                season = "夏季";
                break;
            case 9:
            case 10:
            case 11:
                season = "秋季";
                break;
            default:
                season = "季节输入有误";
        }
        return season;
    }
}
