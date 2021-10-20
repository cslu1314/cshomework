package work;

/**
 * @author zhchch
 * @date 2021/10/20 9:43
 */
import java.util.Arrays;
class Book implements Comparable<Book> {      // 实现比较器
    private String title ;
    private double price ;
    public Book(String title,double price) {
        this.title = title ;
        this.price = price ;
    }
    @Override
    public String toString() {
        return "书名：" + this.title + "，价格：" + this.price + "\n" ;
    }
    @Override
    public int compareTo(Book o) {          // Arrays.sort()会自动调用此方法比较
        if (this.price > o.price) {
            return 1 ;
        } else if (this.price < o.price) {
            return -1 ;
        } else {
            return 0;
        }
    }
}
public class TestDemo {
    public static void main(String[] args) throws Exception {
        Book books [] = new Book [] {
                new Book("Java开发实战经典",79.8) ,
                new Book("JavaWEB开发实战经典",69.8) ,
                new Book("Oracle开发实战经典",99.8) ,
                new Book("Android开发实战经典",89.8)
        } ;
        Arrays.sort(books);                   // 对象数组排序
        System.out.println(Arrays.toString(books));
    }
}
