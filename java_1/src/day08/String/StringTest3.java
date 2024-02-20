package day08.String;

import java.util.Scanner;

public class StringTest3 {
    /*
      手机号屏蔽：
            以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
            最终效果为：156****1234

     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
//        loopChange(num);
        //第二种方法：截取+拼接
        String substring = num.substring(0, 3);
        String substring1 = num.substring(7);
        System.out.println(substring+"****"+substring1);
    }
//第一种方法：使用循环进行替换
    private static void loopChange(String num) {
        char[] chs= num.toCharArray();
        for (int i = 3; i < 7; i++) {
            chs[i]='*';
        }
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i]);
        }
    }
}
