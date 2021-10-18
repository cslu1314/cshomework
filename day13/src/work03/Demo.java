package work03;

/**
 * @author zhchch
 * @date 2021/10/18 20:11
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher(30, "张三", new Student(18, "李四", new Star(11, "王五")));
        System.out.println(teacher);
        Teacher cloneTeacher = teacher.clone();
        System.out.println(cloneTeacher);
        System.out.println("===========================================================================================");
        System.out.println(teacher == cloneTeacher);
        System.out.println(teacher.stu == cloneTeacher.stu);
        System.out.println(teacher.stu.s == cloneTeacher.stu.s);
    }
}

class Teacher implements Cloneable {
    int age;
    String name;
    Student stu;

    public Teacher() {
    }

    public Teacher(int age, String name, Student stu) {
        this.age = age;
        this.name = name;
        this.stu = stu;
    }

    @Override
    protected Teacher clone() throws CloneNotSupportedException {
        //1.深度克隆是在浅克隆基础上完成，先使用原来的Teacher clone出一个cloneTeacher
        Teacher cloneTeacher = (Teacher) super.clone();
        //2.再使用cloneTeacher中的stu克隆一份cloneStudent对象
        Student cloneStudent = cloneTeacher.stu.clone();
        //3.将克隆的cloneTeacher对象含有的cloneStudent指对象，而不是原来的stu
        cloneTeacher.stu = cloneStudent;
        //4.返回cloneTeacher
        return cloneTeacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", stu=" + stu +
                '}';
    }
}

class Student implements Cloneable {
    int age;
    String name;
    Star s;

    public Student() {
    }

    public Student(int age, String name, Star s) {
        this.age = age;
        this.name = name;
        this.s = s;
    }


    @Override
    protected Student clone() throws CloneNotSupportedException {
        //1.深度克隆是在浅克隆基础上完成，先clone出一份Student
        Student cloneStudent = (Student) super.clone();
        //2.克隆一份Star对象
        Star cloneStar = this.s.clone();
        //3.将克隆的引用指向克隆后对象
        cloneStudent.s = cloneStar;
        return cloneStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", s=" + s +
                '}';
    }
}

class Star implements Cloneable {
    int age;
    String name;

    public Star() {
    }

    public Star(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    protected Star clone() throws CloneNotSupportedException {
        //浅clone即可,因为它是别人含有的对象，且它没有引用对象
        return (Star) super.clone();
    }

    @Override
    public String toString() {
        return "Star{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}