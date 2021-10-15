package _polymorphic;

/**
 * @author zhchch
 * @date 2021/10/14 21:41
 */
public class Demo {
    public static void main(String[] args) {
        NorthPerson northPerson = new NorthPerson();
        SouthPerson southPerson = new SouthPerson();
        test(northPerson);
        test(northPerson);
        Person person = new SouthPerson();
        SouthPerson southPerson1 = (SouthPerson) person;
        System.out.println(southPerson1.salary);
        southPerson1.swim();
        Person person1 = new NorthPerson();
    }

    public static void test(Person p) {
        p.eat();
    }
}

abstract class Person {
    public String name;
    public int age;

    public void eat() {
        System.out.println("人都要吃饭");
    }
}

class SouthPerson extends Person {
    public double salary;

    @Override
    public void eat() {
        System.out.println("南方人喜欢吃米饭");
    }

    public void swim() {
        System.out.println("南方人喜欢游泳");
    }
}

class NorthPerson extends Person {
    double height;

    @Override
    public void eat() {
        System.out.println("北方人喜欢吃面食");
    }

    public void drink() {
        System.out.println("南方人喜欢喝酒");
    }
}