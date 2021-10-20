package work.work01;

/**
 * @author zhchch
 * @date 2021/10/20 9:44
 */

import java.util.Arrays;
import java.util.Comparator;

class Book {
    private String title;
    private double price;

    public Book() {
    }

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    //【为啥这里要geteer/setter】
    @Override
    public String toString() {
        return "书名：" + this.title + "，价格：" + this.price + "\n";
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}

class BookComparator implements Comparator<Book> {

    //覆写
    public int compare(Book o1, Book o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() < o2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Demo2 {
    public static void main(String[] args) throws Exception {
        Book books[] = new Book[]{
                new Book("Java开发实战经典", 79.8),
                new Book("JavaWEB开发实战经典", 69.8),
                new Book("Oracle开发实战经典", 99.8),
                new Book("Android开发实战经典", 89.8)
        };
        Arrays.sort(books, new BookComparator());
        System.out.println(Arrays.toString(books));
    }
}
