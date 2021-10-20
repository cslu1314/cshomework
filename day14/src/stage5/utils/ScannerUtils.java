package stage5.utils;


import stage5.entity.Student;
import stage5.entity.StudentList;

import java.util.Scanner;

/**
 * @description: 键盘录入工具类
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class ScannerUtils {
    //需要一个Scanner对象,用来做键盘录入,用static final修饰保证该对象唯一
    private static final Scanner sc = new Scanner(System.in);

    //私有化构造方法
    private ScannerUtils() {
    }


    /*//根据键盘录入,封装成一个Student对象并返回
    public static Student getStudentInstanceByScanner() {
        //为了避免Scanner有异常错误,全部采用nextLine()接收字符串,然后转换类型
        System.out.print("请输入要录入学生的学号：");
        String tempStringStuId = sc.nextLine();
        int stuId = Integer.parseInt(tempStringStuId);
        System.out.print("请输入要录入学生的姓名：");
        String name = sc.nextLine();
        System.out.print("请输入要录入学生的性别：");
        String gender = sc.nextLine();
        System.out.print("请输入要录入学生的班级：");
        String grade = sc.nextLine();
        System.out.print("请输入要录入学生的年龄：");
        String tempStringAge = sc.nextLine();
        int age = Integer.parseInt(tempStringAge);
        System.out.print("请输入要录入学生的电话号码：");
        String phoneNum = sc.nextLine();

        //创建对象,并返回
        return new Student(stuId, name, gender, grade, age, phoneNum);
    }*/

    //根据键盘录入,封装成一个Student对象并返回，但是要对学号做唯一性校验
    //需要传入使用的StudentList对象，进行校验
    public static Student getStudentInstanceByScanner(StudentList sls) {
        //为了避免Scanner有异常错误,全部采用nextLine()接收字符串,然后转换类型

        int stuId;
        while (true) {
            System.out.print("请输入要录入学生的学号：");
            while (true) {
                try {
                    stuId = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("学生学号需要是数字，请输入数字");
                    continue;
                }
                break;
            }

            //调用成员方法来判断stuId是否重复
            if (!sls.judgeStuIdLegal(stuId)) {
                //不允许学号重复
                System.out.println("学号不能重复复！请重新输入");
                continue;
            }
            if (!judgeStuIdLegal(stuId)) {
                System.out.println("学号必须大于0，请重新录入！");
                continue;
            }
            break;
        }

        String name;
        while (true) {
            System.out.print("请输入要录入学生的姓名：");
            name = sc.nextLine();
            if (!judgeStuNameLegal(name)) {
                System.out.println("姓名的字符串长度必须大于1并且小于等于5！请重新输入");
                continue;
            }
            break;
        }

        String gender;
        while (true) {
            System.out.print("请输入要录入学生的性别：");
            gender = sc.nextLine();
            if (!judgeStuGenderLegal(gender)) {
                System.out.println("性别只允许从\"男\",\"女\"中选择!请重新输入");
                continue;
            }
            break;
        }

        String grade;
        while (true) {
            System.out.print("请输入要录入学生的班级：");
            grade = sc.nextLine();
            if (!judgeStuGradeLegal(grade)) {
                System.out.println("班级必须以\"班\"结束，请重新输入");
                continue;
            }
            break;
        }

        int age;
        while (true) {
            System.out.print("请输入要录入学生的年龄：");
            while (true) {
                try {
                    age = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("学生年龄需要是数字，请输入数字");
                    continue;
                }
                break;
            }

            if (!judgeStuAgeLegal(age)) {
                System.out.println("年龄必须大于0且小于150，请重新输入");
                continue;
            }
            break;
        }

        String phoneNum;
        while (true) {
            System.out.print("请输入要录入学生的电话号码，手机号的长度必须是11位，且开头是138,158,136,188：");
            phoneNum = sc.nextLine();
            if (!judgeStuPhoneNumLegal(phoneNum)) {
                System.out.println("手机号输入有误！请重新输入");
                continue;
            }
            break;
        }

        //创建对象,并返回
        return new Student(stuId, name, gender, grade, age, phoneNum);
    }

    private static boolean judgeStuPhoneNumLegal(String phoneNum) {
        if (phoneNum.length() != 11) {
            return false;
        }
        String[] str = {"138", "136", "158", "133", "188"};
        for (String s : str) {
            if (phoneNum.startsWith(s)) {
                return true;
            }
        }
        return false;
    }

    private static boolean judgeStuAgeLegal(int age) {
        return (age > 0 && age < 150);
    }

    private static boolean judgeStuGradeLegal(String grade) {
        return grade.endsWith("班");
    }

    private static boolean judgeStuGenderLegal(String gender) {
        return (gender.equals("男") || gender.equals("女"));
    }

    private static boolean judgeStuNameLegal(String name) {
        return (name.length() > 1 && name.length() <= 5);
    }

    private static boolean judgeStuIdLegal(int stuId) {
        return stuId > 0;
    }

    public static int getStuIdByScanner() {
        System.out.println("请输入要录入的学号：");
        int stuId;
        while (true) {
            try {
                stuId = Integer.parseInt(sc.nextLine());
                return stuId;
            } catch (NumberFormatException e) {
                System.out.println("请输入数字");
                continue;
            }
        }
    }

    public static int getMenuByScanner() {
        int getInt;
        while (true) {
            try {
                getInt = Integer.parseInt(sc.nextLine());
                for (int i = 1; i <= 7; i++) {
                    if (getInt == i) {
                        return getInt;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("需要输入1~7的数字！请重新输入");
                continue;
            }
            System.out.println("需要输入1~7的数字！请重新输入");
        }
    }

    public static int getFlagByScanner() {
        int getInt;
        while (true) {
            try {
                getInt = Integer.parseInt(sc.nextLine());
                for (int i = 1; i <= 2; i++) {
                    if (getInt == i) {
                        return getInt;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("需要输入数字！请重新输入");
                continue;
            }
            System.out.println("需要输入数字1或者2！请重新输入");
        }
    }

    public static int getSortNumByScanner() {
        int getInt;
        while (true) {
            try {
                getInt = Integer.parseInt(sc.nextLine());
                for (int i = 1; i <= 2; i++) {
                    if (getInt == i) {
                        return getInt;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("需要输入数字！请重新输入");
                continue;
            }
            System.out.println("需要输入数字1或者2！请重新输入");
        }
    }
}
