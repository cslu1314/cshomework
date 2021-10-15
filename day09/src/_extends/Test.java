package _extends;

/**
 * @author zhchch
 * @date 2021/10/13 22:54
 */
public class Test {
    public static void main(String[] args) {
        Son son1 = new Son();
        Son son2 = new Son(1);
        Son son3 = new Son(1, 2);
        Son son4 = new Son(1, 2, 3);
        Son son5 = new Son(1, 2, 3, 4);
        Son son6 = new Son(1, 2, 3, 4, 5);
        Son son7 = new Son(1, 2, 3, 4, 5, 6);
    }
}

class GrandFather {
    int gA;
    int a;

    public GrandFather() {
    }

    public GrandFather(int gA, int a) {
        this.gA = gA;
        this.a = a;
    }

    public void testGrand() {
        System.out.println("testGrand");
    }

    public void test() {
        System.out.println("test");
    }
}

class Father extends GrandFather {
    int fA;
    int a;

    public Father() {
        super();
    }

    public Father(int gA, int a) {
        super(gA, a);
    }

    public Father(int gA, int a, int fA, int a1) {
        super(gA, a);
        this.fA = fA;
        this.a = a1;
    }

    public void testSon() {
        System.out.println("testGrand");
    }

    public void test() {
        System.out.println("test");
    }
}

class Son extends Father {
    int testSon, test;

    public Son() {
        super();
    }

    public Son(int testSon) {
        super();
        this.testSon = testSon;
    }

    public Son(int testSon, int test) {
        this.testSon = testSon;
        this.test = test;
    }

    public Son(int gA, int a, int test) {
        super(gA, a);
        this.test = test;
    }

    public Son(int gA, int a, int testSon, int test) {
        super(gA, a);
        this.testSon = testSon;
        this.test = test;
    }

    public Son(int gA, int a, int fA, int a1, int testSon) {
        super(gA, a, fA, a1);
        this.testSon = testSon;
    }

    public Son(int gA, int a, int fA, int a1, int testSon, int test) {
        super(gA, a, fA, a1);
        this.testSon = testSon;
        this.test = test;
    }

    public void testSon() {
        System.out.println("testGrand");
    }

    public void test() {
        System.out.println("test");
    }
}