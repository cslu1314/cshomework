package work01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zhchch
 * @date 2021/10/19 18:39
 */
public class Demo {
    public static void main(String[] args) {
        Cat cat1 = new Cat(12, "花花11111111", 99.9);
        Cat cat2 = new Cat(4, "小白2222", 10.9);
        Cat cat3 = new Cat(9, "小黑3333333", 42.9);
        Cat cat4 = new Cat(5, "小蓝4", 56.9);
        Cat cat5 = new Cat(16, "小绿5555555555555", 19.9);
        Cat cat6 = new Cat(16, "小红红6666666666666666", 59.9);
        Cat cat7 = new Cat(42, "小青77777777777777777777", 89.9);
        Cat cat8 = new Cat(5, "叮当8", 119.9);
        Cat cat9 = new Cat(9, "喵喵99999", 69.9);
        Cat cat10 = new Cat(12, "嘻嘻10101010", 79.9);

        Cat[] cats = {cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8, cat9, cat10};

        System.out.println("########################################猫数组原始数据#######################################");
        System.out.println(Arrays.toString(cats));
        System.out.println("############################################################################################\n");


        System.out.println("===============一、直接实现Comparable接口，按照年龄的从小到大对Cat数组进行自然排序===============");
        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));


        System.out.println("============二、利用Comparator接口，用匿名内部类和lambda分别对Cat数组进行自然排序===============");

        System.out.println("--------------------------2.1利用Comparator接口，按照price从大到小排序----------------------");
        Arrays.sort(cats, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        });
        System.out.println(Arrays.toString(cats));

        System.out.println("--------------------------2.2利用lambda表达式，按照name长短排序，长name排在前面--------------");
        Arrays.sort(cats, (c1, c2) -> c2.getName().length() - c1.getName().length());
        System.out.println(Arrays.toString(cats));

        System.out.println("--------------------------2.2综合age，name，price进行排序，要求用lambda表达式指向一个方法--------------");
        Arrays.sort(cats,Demo::sortByAgeNamePrice);
        System.out.println(Arrays.toString(cats));

    }


    //排序的规则是age越小对象越小，age相同比较name长短，name越短对象越小，name长度也相等，比较price，price越大对象越小
    public static int sortByAgeNamePrice(Cat cat1, Cat cat2) {
        if (cat1.getAge() != cat2.getAge()) {
            return cat1.getAge() - cat2.getAge();
        }
        if(cat1.getName().length()!= cat2.getName().length()){
            return cat1.getName().length() - cat2.getName().length();
        }
        return Double.compare(cat2.getPrice(), cat1.getPrice());
    }
}


class Cat implements Comparable {
    private int age;
    private String name;
    private double price;

    public Cat() {
    }

    public Cat(int age, String name, double price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    //实现Comparable接口，按照年龄的从小到大对Cat数组进行自然排序
    @Override
    public int compareTo(Object o) {
        Cat cat = (Cat) o;
        return this.getAge() - cat.getAge();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}' + "\n";
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}