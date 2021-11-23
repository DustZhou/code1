package zhtcode.testcode;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    // 人才写法git remote add origin git https://github.com/DustZhou/code1.git
    public static void test1(List<String> list) {
        int i = 0;
        try {
            for (;;) {
                System.out.println(list.get(i));
                i++;
            }
        } catch (IndexOutOfBoundsException e) {

        }
    }

    // 一般写法
    public static void test2(List<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    // 一般写法
    public static void test3(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    // 偷懒写法
    public static void test4(List<String> list) {
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("ff");
        System.out.println("test1=====================");
        test1(list);
        System.out.println("test2=====================");
        test2(list);
        System.out.println("test3=====================");
        test3(list);
        System.out.println("test4=====================");
        test4(list);
    }

}