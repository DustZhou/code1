package zhtcode.testcode;
import java.util.Scanner;
import java.lang.StringBuffer;
public class Reverse1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);
        String str= sc.nextLine();
        String str1= sc1.nextLine();
        StringBuffer stringBuffer=new StringBuffer(str);
        StringBuilder stringBuilder=new StringBuilder(str1);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}
