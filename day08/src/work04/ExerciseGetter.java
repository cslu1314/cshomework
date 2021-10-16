package work04;

/**
 * @author zhchch
 * @date 2021/10/15 20:46
 */
public class ExerciseGetter {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3, 4);  //定义一个长方形
        System.out.println(r.getArea());
        System.out.println(r.getCircumference());

        Square s = new Square(5);     //定义一个正方形
        System.out.println(s.getArea());
        System.out.println(s.getCircumference());
    }
}

//长方形类
class Rectangle {
    private double length; //长
    private double width; //宽

    //构造方法
    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Getter、Setter方法
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //获取面积
    public double getArea() {
        return this.length * this.width;
    }

    //获取周长
    public double getCircumference() {
        return 2 * (this.length + this.width);
    }
}

//正方形类
class Square {
    private double length;  //边长

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    //Getter、Setter方法
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //获取面积
    public double getArea() {
        return this.length * this.length;
    }

    //获取周长
    public double getCircumference() {
        return 4 * this.length;
    }

}