import java.util.Scanner;

public class TaxOfIndividual {
    public static void main(String[] args) {
//        System.out.println("请输入某个人的工资薪金：");
//        Scanner sc = new Scanner(System.in);
//        double salary = sc.nextDouble();
//        double taxableIncome = salary - 2000;
//        if (taxableIncome > 0) {
//            if (taxableIncome <= 500) {
//                salary -= (taxableIncome * 5 / 100.0 - 0);
//            } else if (500 < taxableIncome && taxableIncome <= 2000) {
//                salary -= (taxableIncome * 10 / 100.0 - 25);
//            } else if (2000 < taxableIncome && taxableIncome <= 5000) {
//                salary -= (taxableIncome * 15 / 100.0 - 125);
//            } else if (5000 < taxableIncome && taxableIncome <= 20000) {
//                salary -= (taxableIncome * 20 / 100.0 - 375);
//            } else if (20000 < taxableIncome && taxableIncome <= 40000) {
//                salary -= (taxableIncome * 25 / 100.0 - 1375);
//            } else if (40000 < taxableIncome && taxableIncome <= 60000) {
//                salary -= (taxableIncome * 30 / 100.0 - 3375);
//            } else if (60000 < taxableIncome && taxableIncome <= 80000) {
//                salary -= (taxableIncome * 35 / 100.0 - 6375);
//            } else if (80000 < taxableIncome && taxableIncome <= 100000) {
//                salary -= (taxableIncome * 40 / 100.0 - 10375);
//            } else {
//                salary -= (taxableIncome * 45 / 100.0 - 15375);
//            }
//        }
//        System.out.println("他最后得到的工资为：" + salary);


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入工资：");
        double salary = sc.nextDouble();    //工资
        double taxable = salary - 2000;     //应纳税所得额
        double taxRate = 0;                 //税率
        double dedution = 0;                //速算扣除数
        double tax;                         //应纳税额
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

        System.out.println("最后得到的工资为：" + (salary - tax));
    }
}
