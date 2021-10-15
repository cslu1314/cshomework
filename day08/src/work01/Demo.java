package work01;

/**
 * @author zhchch
 * @date 2021/10/15 19:34
 */
public class Demo {
    public static void main(String[] args) {
        Animal animal0 = new Cat("花花", 2, "白色");
        Animal animal1 = new Dog("大黄", 3, "黄色");
        animal0.scream();
        ((Cat) animal0).skill();

        animal1.scream();
        ((Dog) animal1).skill();

    }
}

abstract class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void scream();

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

class Cat extends Animal {
    String color;

    public Cat() {
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void scream() {
        System.out.println("喵喵喵~");
    }

    public void skill() {
        System.out.println("抓老鼠~");
    }
}

class Dog extends Animal {
    String gender;

    public Dog() {
    }

    public Dog(String name, int age, String gender) {
        super(name, age);
        this.gender = gender;
    }

    @Override
    public void scream() {
        System.out.println("汪汪汪~");
    }

    public void skill() {
        System.out.println("看门~");
    }

}
