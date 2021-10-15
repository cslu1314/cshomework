package _polymorphic;

/**
 * @author zhchch
 * @date 2021/10/14 21:41
 */
public class Demo {
    public static void main(String[] args) {

    }
}

class Person {
    public String name;
    public int age;

    public void eat() {
        System.out.println("人都要吃饭");
    }
}

class SouthPerson extends Person {
    public double salary;

    public void eat() {

    }
}

class NorthPerson extends Person {
    double height;
}