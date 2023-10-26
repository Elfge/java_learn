import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner input=new Scanner(System.in);
                int N=input.nextInt();
                int a,b,c;
                int sum;
                if((N>=100)&&(N<=999)){
                    a=N%10;
                    b=N/10%10;
                    c=N/100%10;
                    sum=a*a*a+b*b*b+c*c*c;
                    if(sum==N){
                        System.out.print("Yes");
                    }
                    else{System.out.print("No");}
                }
                else{System.out.println("Invalid Value.");}
    }
}
class lower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        switch (month) {
            case 0:
                System.out.print("一月份");
                break;
            case 1:
                System.out.print("二月份");
                break;
            case 2:
                System.out.print("三月份");
                break;
            case 3:
                System.out.print("四月份");
                break;
            case 4:
                System.out.print("五月份");
                break;
            case 5:
                System.out.print("六月份");
                break;
            case 6:
                System.out.print("七月份");
                break;
            case 7:
                System.out.print("八月份");
                break;
            case 8:
                System.out.print("九月份");
                break;
            case 9:
                System.out.print("十月份");
                break;
            case 10:
                System.out.print("十一月份");
                break;
            case 11:
                System.out.print("十二月份");
                break;
            default:
                System.out.print("Invalid value.");
                break;
        }
    }
}
class massage {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("姓名：朱国栋");
        System.out.println("年龄："+18);
        System.out.println("性别="+'男');
        System.out.println("婚姻状况="+false);
    }
}