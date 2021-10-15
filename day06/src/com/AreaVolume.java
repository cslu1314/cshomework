package com;

import java.util.Scanner;

public class AreaVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长方体的长：");
        double length = Double.parseDouble(sc.next());

        System.out.println("请输入长方体的宽：");
        double wide = Double.parseDouble(sc.next());

        System.out.println("请输入长方体的高：");
        double height = Double.parseDouble(sc.next());
        
        Cuboid cuboid = new Cuboid(length, wide, height);
        System.out.println("长方体的长为：" + cuboid.length
                + " 长方体的宽为：" + cuboid.wide
                + " 长方体的高为：" + cuboid.height);
        System.out.println("长方体的面积为：" + cuboid.getArea()
                + " 长方体的体积为：" + cuboid.getVolume());
    }
}

class Cuboid {
    double length;
    double wide;
    double height;

    public Cuboid() {
    }

    public Cuboid(double length, double wide, double height) {
        this.length = length;
        this.wide = wide;
        this.height = height;
    }

    public double getVolume() {
        return length * wide * height;
    }

    public double getArea() {
        double area = (length * wide + length * height + wide * height) * 2;
        return area;
    }
}
