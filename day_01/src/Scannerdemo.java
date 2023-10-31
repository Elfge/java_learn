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
          int m=变量名.nextInt();


    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int ages=m;
        System.out.println("age="+ages);

    }
}
