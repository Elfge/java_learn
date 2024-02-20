package day08.String;

import java.util.Scanner;

public class StringBuilderTest {
    /*
    需求：
        键盘接受一个字符串，程序判断出该字符串是否是对称字符串（回文字符串），并在控制台打印是或不是
            对称字符串：123321 、111
            非对称字符串：123123


            String--------->StringBuilder
                        String s="abc"
                        StringBuilder sb=new StringBuilder(s);
           StringBuilder------------------>String
                        String s=sb.toString();
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        if(sb.reverse().toString().equals(s)){
            System.out.println("是");
        }else{
            System.out.println("不是");
        }
    }
}
