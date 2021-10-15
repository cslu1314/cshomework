public class Student {
    String name;
    int age;
    String gender;
    int stuId;

    //1，无参构造
    public Student() {
    }

    //* 2，初始化name成员变量值的单参构造方法
    public Student(String name) {
        this.name = name;
    }

    // * 3，初始化name和stuId两个成员变量值的双参构造方法
    public Student(String name, int stuId) {
        this.name = name;
        this.stuId = stuId;
    }

    //* 4，初始化name，age，gender三个成员变量值的三参构造方法
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //* 5，初始化name，age，gender，stuId这4个成员变量值的4参构造方法
    public Student(String name, int age, String gender, int stuId) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.stuId = stuId;
    }

    //    定义一个成员方法print()，打印这个学生类对象信息
    public void print() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", stuId=" + stuId +
                '}');
    }


//    再上面5个构造方法的基础上，不可以再定义一个构造方法单独给gender赋值
//    ，因为会和初始化name成员变量值的单参构造方法构成歧义
   /* public Student(String gender) {  //'Student(String)' is already defined in 'Student'
        this.gender = gender;
    }*/


    //    定义完这个类后，创建两个Student对象分别为stu1和stu2
// * 要求stu1对象的四个成员变量name, age, gender, stuId的值分别为“张三”,18,"男", 1
//            * 要求stu2对象的四个成员变量name, age, gender, stuId的值分别为“李四”,25,"女", 2
//            * 两个对象分别调用print()方法
    public static void main(String[] args) {
        //    定义完这个类后，创建两个Student对象分别为stu1和stu2
        Student stu1 = new Student("张三", 18, "男", 1);
        Student stu2 = new Student("李四", 25, "女", 2);
//        两个对象分别调用print()方法
        stu1.print();
        stu2.print();

        // * 两次调用方法输出的结果相同吗？
//        答：不相同，因为在一个Java类的任何(不加static)成员方法中,它的形参列表中都隐含了一个传参this，
//        而两次调用传入的this都是当前对象，分别是stu1、stu2，因此打印出的信息是分别stu1的、stu2的
    }
}
