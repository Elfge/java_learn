import java.util.Scanner;
import java.util.Random;

public class Text1 {
    public static void main(String[] args) {

    }
    //打印九九乘法表
    public static void print99(){
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=i; j++) {

                System.out.print(j+"*"+i+"="+j*i+" ");
            }
            System.out.println();
        }
    }
    //无限循环的使用
    public static void initmenu() {
        Scanner sc = new Scanner(System.in);
        lo:
        for(;;){
            System.out.println("请输入您的选择：1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("添加学生逻辑执行");
                    break;
                case 2:
                    System.out.println("删除学生逻辑执行");
                    break;
                case 3:
                    System.out.println("修改学生逻辑执行");
                    break;
                case 4:
                    System.out.println("查看学生逻辑执行");
                    break;
                case 5:
                    System.out.println("执行完毕，退出程序");
                    break lo;
            }
        }
    }

}