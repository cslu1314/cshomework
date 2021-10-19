package work02;

/**
 * @author zhchch
 * @date 2021/10/18 19:36
 */
public class Animal {
    int age;
    String name;
    double price;

    public Animal() {
    }

    public Animal(int age, String name, double price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    //重写equals方法之instanceof
//    @Override
//    public boolean equals(Object obj) {
//        //1.满足自反性,自己和自己比,返回true
//        if (this == obj) return true;

//        //2.排他性
//        //instanceof
//        if (!(obj instanceof Animal)) {
//            return false;
//        }

//        // 3.对称性,一致性,传递性只需要按照成员变量的取值判断对象相等就自动满足
//        Animal animal = (Animal) obj;
//        if (this.age != animal.age
//                || !this.name.equals(animal.name)
//                || Double.compare(this.price, animal.price) != 0) {
//            return false;
//        }

//        return true;
//    }


    //重写equals方法之getClass
    @Override
    public boolean equals(Object obj) {
        //1.满足自反性,自己和自己比,返回true
        if (this == obj) return true;

        //2.排他性
        //getClass
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        // 3.对称性,一致性,传递性只需要按照成员变量的取值判断对象相等就自动满足
        Animal animal = (Animal) obj;
        if (this.age != animal.age
                || !this.name.equals(animal.name)
                || Double.compare(this.price, animal.price) != 0) {
            return false;
        }

        return true;
    }
}
