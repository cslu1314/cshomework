package stage1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class StudentsManagementSystem {
    public static void printSystemMenu() {
        System.out.println("-----------王道学生管理系统------------");
        System.out.println("            1.学生列表");
        System.out.println("            2.增加学生");
        System.out.println("            3.删除学生");
        System.out.println("            4.修改学生");
        System.out.println("            5.查询学生");
        System.out.println("            6.退出系统");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        boolean flag = true;
        while (flag) {
            printSystemMenu();
            System.out.println("请选择功能（1-6）：");
            select = Integer.parseInt(sc.next());
            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("确认退出吗（1/2）");
                    int input = Integer.parseInt(sc.next());
                    if (input == 1) {
                        System.out.println("感谢使用本系统！");
                        flag = false;
                    }
                    break;
            }
        }
    }
}
