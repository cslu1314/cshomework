package work02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author zhchch
 * @date 2021/10/19 19:24
 */
public class Demo {
    public static void main(String[] args) throws ParseException {
        while (true) {
            int daysOfYou = CalcDays.getDaysOfYou();

            if (daysOfYou == -1) {
                System.out.println("你输入的是未来的时间，你将会在未来出生:)");
            } else {
                System.out.println("你已经出生了" + daysOfYou + "天");
            }
            System.out.println();
        }
    }
}

class CalcDays {
    private static Scanner sc = new Scanner(System.in);

    private CalcDays() {
    }

    public static int getDaysOfYou() throws ParseException {
        System.out.println("请输入你的出生日期，格式是yyyy.MM.dd:");
        String birthday = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        //使用sdf把你输入的字符串转换成Date对象(即你的出生日期)
        Date parseBirthday = sdf.parse(birthday);
        //当前Date
        Date currentDate = new Date();

        //Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT
        long currentDateTime = currentDate.getTime();
        long parseBirthdayTime = parseBirthday.getTime();
        //时间差
        long seconds = currentDateTime - parseBirthdayTime;
        if (seconds < 0) {
            return -1;
        }
        return (int) (seconds / 1000 / 60 / 60 / 24);
    }
}
