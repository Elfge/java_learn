package day08.String;

import java.util.Scanner;

public class StringTest1 {
    /*
        需求：模拟用户登录，一共三次机会，登录后要给出相应的提示
            分析：
                1.定义两个字符串类型的变量，模拟已经存在的用户名和密码
                2.键盘录入用户输入的用户名和密码
                3.比对
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String user="abc";
        String keyPass="123";
        for(int i=1;i<=3;i++){

            System.out.println("用户名：");
            String inputUser=sc.next();
            System.out.println("密码：");
            String inputKeypass=sc.next();
            if(user.equals(inputUser)&&keyPass.equals(inputKeypass)){
                System.out.println("登录成功");
                break;
            }else {
                if(i==3){
                    System.out.println("失败过多，请稍后重试");
                }else{

                    System.out.println("登录失败"+"您还剩"+(3-i)+"次机会");
                }
            }
        }
    }
}
