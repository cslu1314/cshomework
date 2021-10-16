package work05;

/**
 * @author zhchch
 * @date 2021/10/15 22:23
 */
public class Demo {

}

class Student {
    int age;
    String name;
    static int var;

//    {
//        var = 10;
//    }

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name) {
        this(var);
        this.name = name;
    }
}