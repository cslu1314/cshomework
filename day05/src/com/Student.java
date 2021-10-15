package com;

public class Student {
    String name;
    int age;
    String gender;
    int stuId;
    double score;

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

    //    增加一个构造方法，能够给学生对象全体成员变量赋值，要求使用this简化代码
    public Student(String name, int age, String gender, int stuId, double score) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.stuId = stuId;
        this.score = score;
    }

    //    修改print()方法，打印这个学生类对象信息
    public void print() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", stuId=" + stuId +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}');
    }


    public static void main(String[] args) {
//        创建五个该类的对象存入数组，先遍历输出每个学生的信息，再计算他们的平均Java成绩（尽量提取方法）
        Student[] students = new Student[5];
        students[0] = new Student("宋江", 23, "男", 1, 95.5);
        students[1] = new Student("李逵", 24, "男", 2, 60.5);
        students[2] = new Student("林冲", 25, "男", 3, 82.5);
        students[3] = new Student("鲁智深", 26, "男", 4, 67.5);
        students[4] = new Student("武松", 27, "男", 5, 76.5);
        System.out.println("学生的平均成绩是：" + getAveScore(students));

    }

    public static double getAveScore(Student[] students) {
        double score = 0;
        for (Student student : students) {
            student.print();
            score += student.score;
        }
        return score / students.length;
    }
}
