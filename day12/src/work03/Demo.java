package work03;

/**
 * @author zhchch
 * @date 2021/10/16 15:42
 */
public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Class catClass = cat.getClass();
        Class dogClass = dog.getClass();
        System.out.println(catClass == dogClass);
    }
}
class Cat{}
class Dog{}