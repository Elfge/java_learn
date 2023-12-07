package Elfge.java.scanner;

import java.util.Scanner;
public class Scannerdemo {
    /*
         1.找符咒
            代码：import java.util.Scanner;
            位置:class上面;
            含义:能够让自己的类Scannerdemo，从代码仓库中，找到Scanner符咒
         2.召唤精灵
          代码：Scanner 变量名=new Scanner(System.in);
          含义：召唤精灵，并给精灵起名
         3.指挥精灵
          int m=变量名.nextInt();  从键盘录入整数，并使用Int类型变量接收
          double m=变量名.nextDouble();  从键盘录入小数，并使用Double类型变量接收
          boolean m=变量名.nextBoolean();  从键盘录入布尔，并使用Boolean类型变量接收
          String m=变量名.next();  从键盘录入字符串，并使用String类型变量接收


    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int ages=m;
        System.out.println("age="+ages);

    }
}
