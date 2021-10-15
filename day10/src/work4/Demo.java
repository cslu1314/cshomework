package work4;

/**
 * @author zhchch
 * @date 2021/10/14 22:48
 */
public class Demo {
    public static void main(String[] args) {
        Person teacher = new Teacher();
        teacher.eat();
        teacher.sleep();
        teacher.learningEnglish();
        Person student = new Student();
        student.eat();
        student.sleep();
        student.learningEnglish();

        System.out.println("===================");
        IStudy iStudy1 = new Teacher();
        iStudy1.learningEnglish();
        iStudy1.test();
        IStudy iStudy2 = new Student();
        iStudy2.learningEnglish();
        iStudy2.test();
    }
}

interface IStudy {
    void learningEnglish();

    default void test() {
        System.out.println("defalut方法");
    }
}


abstract class Person implements IStudy {
    String name;
    String gender;
    int age;

    public abstract void eat();

    public abstract void sleep();
}

class Teacher extends Person {
    @Override
    public void eat() {
        System.out.println("老师需要吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("老师需要睡觉");
    }

    @Override
    public void learningEnglish() {
        System.out.println("老师学英语");
    }
}

class Student extends Person {
    @Override
    public void eat() {
        System.out.println("学生需要吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("学生需要睡觉");
    }


    @Override
    public void learningEnglish() {
        System.out.println("学生学英语");
    }
}

