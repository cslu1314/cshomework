package com;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Class clas1 = new Class(1, 3);
        Class clas2 = new Class(2, 2);
        Class clas3 = new Class(3, 5);
        clas1.insertScores();
        clas2.insertScores();
        clas3.insertScores();
        System.out.println(clas1.getClassId() + "班的平均成绩是：" + clas1.getAveScore());
        System.out.println(clas1.getClassId() + "班的最高分是：" + clas1.getMaxScore());
        System.out.println(clas1.getClassId() + "班的最低分是：" + clas1.getMinScore());
        System.out.println(clas2.getClassId() + "班的平均成绩是：" + clas2.getAveScore());
        System.out.println(clas2.getClassId() + "班的最高分是：" + clas2.getMaxScore());
        System.out.println(clas2.getClassId() + "班的最低分是：" + clas2.getMinScore());
        System.out.println(clas3.getClassId() + "班的平均成绩是：" + clas3.getAveScore());
        System.out.println(clas3.getClassId() + "班的最高分是：" + clas3.getMaxScore());
        System.out.println(clas3.getClassId() + "班的最低分是：" + clas3.getMinScore());
    }
}

class Class {
    private int classId;
    private int count;
    private double[] scores;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public Class(int classId, int count) {
        this.classId = classId;
        this.count = count;
        scores = new double[count];
    }

    public void insertScores() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入" + classId + "班，学生" + (i + 1) + "的成绩：");
            scores[i] = Double.parseDouble(sc.next());
        }
    }

    //总成绩
    public double getSumScore() {
        double sumScore = 0.0;
        for (double score : scores) {
            sumScore += score;
        }
        return sumScore;
    }

    //平均成绩
    public double getAveScore() {
        return getSumScore() / count;
    }

    //最高分
    public double getMaxScore() {
        double max = scores[0];
        for (double score : scores) {
            if (score > max) max = score;
        }
        return max;
    }

    //最低分
    public double getMinScore() {
        double min = scores[0];
        for (double score : scores) {
            if (score < min) min = score;
        }
        return min;
    }
}
