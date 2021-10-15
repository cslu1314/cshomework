/**
 * @author zhchch
 * @date 2021/10/13 22:01
 */
public class Test {
    public static void main(String[] args) {
        Sub sub = new Sub();
    }
}

class Base {
    static {
        System.out.println("base 静态代码块");
    }

    {
        System.out.println("base 构造代码块");
    }

    public Base() {
        System.out.println("base无参构造");
    }
}

class Sub extends Base {
    static {
        System.out.println("sub 静态代码块");
    }

    {
        System.out.println("sub 构造代码块");
    }

    public Sub() {
        //super()
        System.out.println("sub 无参构造");
    }
}