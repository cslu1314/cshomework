package work03;

import java.io.File;
import java.io.IOException;

/**
 * @author zhchch
 * @date 2021/10/20 15:48
 */
public class Demo {
    public static void main(String[] args) throws IOException {

       /* 文件操作相关API练习
        File file = new File("F:\\TestDirectory");
        System.out.println(file.exists());

        new Demo().deleteFile(file);

        File file = new File("F:\\TestDirectory\\2.mp3\\hello");
        System.out.println(file.createNewFile());

        File file1 = new File("F:\\TestDirectory\\2.mp3\\a\\b");
        System.out.println(file1.mkdirs());

        File file1 = new File("F:\\TestDirectory\\2.mp3\\a");
        System.out.println(file1.delete());

        File file1 = new File("F:\\TestDirectory\\2.mp3\\a");
        System.out.println(file1.isDirectory());

        File file1 = new File("F:\\TestDirectory\\1.jpg");
        System.out.println(file1.isFile());

        File file1 = new File("F:\\TestDirectory\\1.jpg");
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getPath());


        for (int i = 0; i < list.length; i++) {
            String s = list[i];
            System.out.println(s);
        }

        File[] files = file1.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            System.out.println(file.getName() + "   " + file.getPath());
        }
*/

        File files = new File("F:\\新建文件夹\\TestDirectory");

        //此方法使用之前需要看清文件路径！
        new Demo().deleteFile(files);

    }

    public void deleteFile(File file) {
        File[] files = file.listFiles();
        if (files == null || files.length == 0) {
            file.delete();
            return;
        }
        for (int i = 0; i < files.length; i++) {
            File file1 = files[i];
            if (file1.isFile()) {
                file1.delete();
            } else {
                deleteFile(file1);
            }
        }
        file.delete();
    }
}
