import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Company company = new Company();

        double[] aveSaleCount = company.getAveSaleCount();
        for (int i = 0; i < aveSaleCount.length; i++) {
            System.out.println("第" + (i + 1) + "月的平均销售额是:" + aveSaleCount[i]);
        }
        System.out.println("年度销售总额是：" + company.getYearSaleCount());
    }
}

class Company {
    int[] firstSeason /*= {30, 66, 48}*/;
    int[] secondSeason /*= {10, 33, 20}*/;
    int[] thirdSeason /*= {10, 99, 103}*/;
    int[] fourthSeason /*= {9, 18, 27}*/;
    int[][] year /*= {firstSeason, secondSeason, thirdSeason, firstSeason}*/;

    public Company() {
        firstSeason = new int[3];
        secondSeason = new int[3];
        thirdSeason = new int[3];
        fourthSeason = new int[3];
        year = new int[][]{firstSeason, secondSeason, thirdSeason, fourthSeason};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("请输入第" + (i + 1) + "个季度第" + (j + 1) + "个销售额：");
                year[i][j] = Integer.parseInt(sc.next());
            }
        }
        System.out.println();
        System.out.println("每个季度的销售额为：");
        for (int i = 0; i < year.length; i++) {
            System.out.println("第" + (i + 1) + "季度：" + Arrays.toString(year[i]));
        }
        System.out.println();
    }

    public double[] getAveSaleCount() {
        double[] aveSaleCounts = new double[year.length];
        for (int i = 0; i < year.length; i++) {
            double sum = 0.0;
            for (int j = 0; j < year[i].length; j++) {
                sum += year[i][j];
            }
            aveSaleCounts[i] = sum / year[i].length;
        }
        return aveSaleCounts;
    }

    public double getYearSaleCount() {
        double sum = 0.0;
        for (int i = 0; i < year.length; i++) {
            for (int j = 0; j < year[i].length; j++) {
                sum += year[i][j];
            }
        }
        return sum;
    }
}
