package work04;

/**
 * @author zhchch
 * @date 2021/10/15 22:01
 */
public class Demo {
    public static void main(String[] args) {
        new Dog(3, "哈士奇", "黑白相间").printDog();
    }
}

class Dog {
    private int age;
    private String name;
    private Body body;

    private class Body {
        private String color;

        private Body() {
        }

        private Body(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    private Dog() {
    }

    public Dog(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.body = new Body(color);
    }

    public void printDog() {
        System.out.println("狗的年龄是:" + this.age + "岁\t名字是:" + this.name + "\t颜色是:" + this.body.color);
    }
}
