package work04;

/**
 * @author zhchch
 * @date 2021/10/18 20:44
 */
public class Demo {
    public static void main(String[] args) {
        String str = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        System.out.println(getNumOfJavaInBigStr(str,"java"));
    }

    public static int getNumOfJavaInBigStr(String BigStr, String smallStr) {
        int count = 0, index = 0;
        boolean flag = true;
        while (flag) {
            //int indexOf(String str,int fromIndex) 这个方法从大字符串的index下标开始查询小字符串 并返回查找到小字符串的最小下标 如果没找到返回-1
            if (-1 != BigStr.indexOf(smallStr, index)) {
                count++;
                //下一次查找的起始下标
                index = BigStr.indexOf(smallStr, index) + 1;
                continue;
            }
            //没有找到则终止循环
            flag = false;
        }
        return count;
    }
}
