package work01;

/**
 * @author zhchch
 * @date 2021/10/14 23:31
 */

/**
 * 问题1: 思考注释一能否放开?会不会报错?如果想要提升代码可读性,怎么做?
 * 问题2: 思考控制台输出的顺序,并用文字描述它,需要说明原因
 * 问题3: Homework building和Homework constructor会不会输出,为什么?
 */
public class Homework {
    static Student s = new Student();

    {
        System.out.println("Homework building");
        s = null;
    }

    public static void main(String[] args) {
        System.out.println("main");
        System.out.println(s.age); //注释一
        Person p = new Person("刘备");
        System.out.println(p.name);
    }

    public Homework() {
        System.out.println("Homework constructor");
    }
}

class Person {
    {
        name = "赵云";
        System.out.println("Person building");
    }

    String name = "曹操";
    static Student s = new Student();

    public Person() {
    }

    public Person(String name) {
        System.out.println("Person constructor");
        this.name = name;
    }
}

class Student {
    int age = 10;

    {
        System.out.println("Student building");
        age = 20;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student() {
        System.out.println("Student constructor");
    }
}