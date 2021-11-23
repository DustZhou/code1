package zhtcode.testcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrays {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("wanglei");
        list.add("deboke");
        String[] array1 = list.toArray(new String[list.size()]);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        //Arrays to List
        String[] array = new String[]{"wanglei", "deboke"};
        List<String> list1 = Arrays.asList(array);
        System.out.println(list1);
    }
}
