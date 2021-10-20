package work04;

import java.io.File;
import java.io.FileFilter;


/**
 * @author zhchch
 * @date 2021/10/20 16:56
 */
public class Demo {
    public static void main(String[] args) {
        File files = new File("F:\\新建文件夹\\TestDirectory");
        File[] files2 = files.listFiles();
        System.out.println("----------------------文件中含有的内容-------------------");
        for (File file : files2) {
            System.out.println(file.getName());
        }

        System.out.println("------------仅留下文件夹名包括a的文件夹--------------------");
        //传入FileFilter的实现类MyFilter的对象
        File[] files1 = files.listFiles(new MyFilter());
        for (int i = 0; i < files1.length; i++) {
            System.out.println(files1[i].getName());
        }

        System.out.println("---------------仅留下.txt结尾的文本文件------------------");
        //使用匿名内部类
        File[] txts = files.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".txt") && pathname.isFile();
            }
        });
        for (int i = 0; i < txts.length; i++) {
            System.out.println(txts[i].getName());
        }


        System.out.println("---------------仅留下以a开头的文件-----------------------");
        //使用lambda表达式
        File[] as = files.listFiles(f -> f.isFile() && f.getName().startsWith("a"));
        for (File a : as) {
            System.out.println(a.getName());
        }

    }


}

class MyFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.isDirectory() && pathname.getName().contains("a");
    }
}