package zhtcode.testcode;
import java.util.Scanner;
public class Mscode {
    public static void main(String[] arge){
        Scanner sc=new Scanner(System.in);




    }
    public static boolean palindrome(int num){
        String str=String.valueOf(num);
        String reverse=new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
    public static boolean isPalindrome(int x){
        int t=0;
        while (x>t){
            t=t*10+x%10;
            if (t==0)return false;
            x/=10;
        }
        return (x==t||x==t/10);
    }

}
