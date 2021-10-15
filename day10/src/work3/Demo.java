package work3;

/**
 * @author zhchch
 * @date 2021/10/14 22:40
 */
public class Demo {
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}

abstract class A {
    int a = 10;

    public abstract void showA();
}

abstract class B extends A {
    int b = 20;

    public abstract void showB();
}

class C extends B {
    int c = 30;

    @Override
    public void showA() {
        System.out.println(a);
    }

    @Override
    public void showB() {
        System.out.println(b);
    }

    public void showC() {
        System.out.println(c);
    }

}

