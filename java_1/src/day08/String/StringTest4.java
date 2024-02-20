package day08.String;

import java.util.Scanner;

public class StringTest4 {
    /*
    敏感词：
        从键盘录入一个字符串，如果字符串中包含TMD,使用***作替换
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String content=sc.nextLine();
        String tmd = content.replace("TMD", "***");
        System.out.println(tmd);
    }
}
