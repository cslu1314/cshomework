package work01;

import java.util.Objects;

/**
 * @author zhchch
 * @date 2021/10/18 19:22
 */
public class Demo {
    public static void main(String[] args) {

    }
}

class Student {
    int age;
    String name;
    String gender;

    public Student() {
    }

    public Student(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                Objects.equals(getName(), student.getName()) &&
                Objects.equals(getGender(), student.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName(), getGender());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
