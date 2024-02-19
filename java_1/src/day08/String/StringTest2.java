package day08.String;

import java.util.Scanner;

public class StringTest2 {
    /*
    字符串的遍历：
        public char[] toStringArray() 将字符串转换为字符数组
        public char charAt(int index) 根据索引找字符
        public int length()  返回字符串的长度

        String s="admin";
        char[] chs= s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);

        String s="admin";
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
     */
    public static void main(String[] args) {
        /*
       统计字符次数：
                需求：键盘录入一个字符串，统计该字符串中，大写字母字符，小写字母字符，数字字符出现的次数
                （不考虑其他字符）
                    例如：例如 :  aAb3&c2B*4CD1
         */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] chs=s.toCharArray();
        int smallCount=0,bigCount=0,numCount=0;
        int[] count=new int[3];
        for (int i = 0; i < chs.length; i++) {
            char c=chs[i];
            if(c>='a'&&c<='z'){
                smallCount++;
            }else if(c>='A'&&c<='Z'){
                bigCount++;
            }else if(c>='0'&&c<='9'){
                numCount++;
            }
        }
            System.out.println("大写字母数："+bigCount);
            System.out.println("小写字母数："+smallCount);
            System.out.println("数字字符数："+numCount);

    }
}
