import java.util.Scanner;

public class TaxOfIndividual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入工资：");
        double salary, tax;
        salary = Double.parseDouble(sc.next());
        while (salary > 0) {
            tax = getTax(salary);
            System.out.println("应缴纳的税额是：" + tax);
            System.out.println("最后他的到手工资是：" + (salary-tax));
            salary = Double.parseDouble(sc.next());
        }
    }

    private static double getTax(double salary) {
        double taxable = salary - 2000;
        double taxRate = 0;
        double dedution = 0;
        double tax;
        if (taxable > 0) {
            if (taxable <= 500) {
                taxRate = 0.05;
                dedution = 0;
            } else if (taxable > 500 && taxable <= 2000) {
                taxRate = 0.10;
                dedution = 25;
            } else if (taxable > 2000 && taxable <= 5000) {
                taxRate = 0.15;
                dedution = 125;
            } else if (taxable > 5000 && taxable <= 20000) {
                taxRate = 0.20;
                dedution = 375;
            } else if (taxable > 20000 && taxable <= 40000) {
                taxRate = 0.25;
                dedution = 1375;
            } else if (taxable > 40000 && taxable <= 60000) {
                taxRate = 0.30;
                dedution = 3375;
            } else if (taxable > 60000 && taxable <= 80000) {
                taxRate = 0.35;
                dedution = 6375;
            } else if (taxable > 80000 && taxable <= 100000) {
                taxRate = 0.40;
                dedution = 10375;
            } else if (taxable > 100000) {
                taxRate = 0.45;
                dedution = 15375;
            }
        }

        //应纳税额 = 应纳税所得额 * 税率 - 速算扣除数 （速算扣除额已经扣除了重复计算的部分）
        tax = taxable * taxRate - dedution;
        return tax;
    }
}
