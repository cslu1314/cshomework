public class DecToBin {
    public static void main(String[] args) {
        int num = 16;
        System.out.println("十进制数：" + num
                + "转化为二进制数是：" + DecimalToBinaryByRecursion(num));
    }

    //除二取余法
    public static String DecimalToBinaryByRecursion(int num) {
        int quotient = num / 2;             //除以2
        int remainder = num % 2;            //余数
        StringBuilder result = new StringBuilder("");
        if (quotient == 0) {
            return result.append(remainder).toString();
        }
        return DecimalToBinaryByRecursion(quotient) + remainder;    //每轮余数放到后面输出
    }

}
