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
        for (int i = 1; i <= 12; i++) {
            switch (i) {
                case 12:
                case 1:
                case 2:
                    System.out.println(i + "是 冬季");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println(i + "是 春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(i + "是 夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(i + "是 秋季");
                    break;
            }
        }

    }
}
