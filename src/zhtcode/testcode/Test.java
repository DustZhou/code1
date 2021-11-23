package zhtcode.testcode;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Test {

    /**
     * @param args
     */
//    public static void main(String[] args) {
//        List list=new ArrayList();
//        list.add("王利虎");
//        list.add("张三");
//        list.add("李四");
//        int size=list.size();
//        String[] array=new String[size];
//        for(int i=0;i<list.size();i++){
//            array[i]=(String)list.get(i);
//        }
//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
//    }
//    public static void main(String[] args) {
//        List<String> list=new ArrayList<String>();
//        list.add("王利虎");
//        list.add("张三");
//        list.add("李四");
//        int size=list.size();
//        String[] array = (String[])list.toArray(new String[size]);
//        for(int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
//    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("王利虎","张三","李四");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    }