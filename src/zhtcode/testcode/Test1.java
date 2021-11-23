package zhtcode.testcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args){
//        String[] arr = new String[5];
//        arr[0]="a";
//        arr[1]="b";
//        arr[2]="c";
//        arr[3]="d";
//        arr[4]="e";
//        List<String> list = new ArrayList<>(Arrays.asList(arr));
//        for ( int  i =  0 ;i < list.size();i++){
//            System.out.println(list.get(i));
//        }


        //将list集合转换为数组Array
//        List<Integer> list = new ArrayList<>() {{
//        add(1);
//        add(2);
//        add(3);
//        add(4);
//        add(5);
//        }};
//        String[] array = list.toArray(new String[list.size()]);
//
//        for(int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
        //要转换的list集合
        List<String> testList = new ArrayList<String>(){{add("aa");add("bb");add("cc");}};

        //使用toArray(T[] a)方法
        String[] array2 = testList.toArray(new String[testList.size()]);

//打印该数组
//        for(int i = 0; i < array2.length; i++){
//            System.out.println(array2[i]);
//        }
        System.out.println(Arrays.toString(array2));
    }

}
