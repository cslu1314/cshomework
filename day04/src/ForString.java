import java.util.Arrays;

public class ForString {
    public static void main(String[] args) {
        String[] strs = new String[]{"ab", "cd", "ef", "jk", "lm"};

        System.out.println(Arrays.toString(strs));
        System.out.println("===========================");
        printString1(strs);
        System.out.println("===========================");
        printString2(strs);

    }

    public static void printString1(String[] strs) {
        System.out.print("[");
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + ", ");
        }
        System.out.print("\b\b]");
        System.out.println();
    }

    public static void printString2(String[] strs) {
        System.out.print("[");
        for (String str : strs) {
            System.out.print(str + ", ");
        }
        System.out.print("\b\b]");
        System.out.println();
    }
}
