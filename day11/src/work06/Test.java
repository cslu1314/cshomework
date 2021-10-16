package work06;

/**
 * @author zhchch
 * @date 2021/10/15 22:33
 * 读程序，然后分析过程和结果，思考结果为什么会如此，提供必要的文字说明
 */
public class Test {
    public static void main(String[] args) {
        Father f1 = new Son(1000);  // 0
        Father f2 = new Father();     // 10
        Son s = new Son(1000);      // 0
    }
}

class Father {
    int i = 10;

    public Father() {
        System.out.println(getI());
    }

    public int getI() {
        return i;
    }
}

class Son extends Father {
    int i = 100;

    public Son(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }
}