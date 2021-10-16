package work05;

/**
 * @author zhchch
 * @date 2021/10/15 20:55
 */
public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            System.out.println("创建的对象是：" + Student.getInstance());
        }
    }
}

class Student {
    private static int count = 1;
    private String name;
    private int age;

    private Student() {
    }

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static Student getInstance() {
        if (count <= 10) {
            System.out.println("创建Student对象" + Student.count + "次");
            Student.count++;
            return new Student();
        } else {
            System.out.println("创建失败");
            return null;
        }
    }


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

