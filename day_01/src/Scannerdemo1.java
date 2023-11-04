import java.util.Scanner;
public class Scannerdemo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //从键盘录入姓名
        System.out.println("请输入您的姓名:");
        String name =input.next();
        //从键盘录入年龄
        System.out.println("请输入您的年龄:");
        int age=input.nextInt();
        //从键盘录入性别
        System.out.println("请输入您的性别:");
        String sex=input.next();
        //从键盘录入身高
        System.out.println("请输入您的身高：");
        double high=input.nextDouble();
        //从键盘录入婚姻状况
        System.out.println("请输入您的婚姻状况：");
        boolean marry=input.nextBoolean();
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
        System.out.println(high);
        System.out.println(marry);
        System.out.println("注册完成");
    }

}
