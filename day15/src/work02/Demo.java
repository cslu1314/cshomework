package work02;

/**
 * @author zhchch
 * @date 2021/10/20 15:20
 */
public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();

        System.out.println("start");

        try {
            demo.test();
        } catch (OneException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------");

        try {
            demo.test1();
        } catch (OneRuntimeException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }

    public void test() throws OneException {
        throw new OneException();
    }

    public void test1() {
        throw new OneRuntimeException();
    }
}

//自定义编译时异常
class OneException extends Exception {
    public OneException() {
    }

    public OneException(String message) {
        super(message);
    }
}

//自定义运行时异常
class OneRuntimeException extends RuntimeException {
    public OneRuntimeException() {
    }


    public OneRuntimeException(String message) {
        super(message);
    }
}

