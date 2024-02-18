package testgame;

/*猜数字：
    1.用Random产生一个1-100之间的随机数 ------>randomNumber
    2.用户录入所猜数字
    3.比对


*/

import java.util.Random;
import java.util.Scanner;

public class Randomtest {
    public static void main(String[] args) {
    guess();
    }
    public static void guess(){
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int randomNumber= r.nextInt(100)+1;
        while (true){
            System.out.println("请输入");
            int scNumber= sc.nextInt();
            if(scNumber<randomNumber){
                System.out.println("猜小了");
            }else if(scNumber>randomNumber){
                System.out.println("猜大了");
            }else if(scNumber==randomNumber){
                System.out.println("猜对了");
                break;
            }
            System.out.println("恭喜");
        }
    }
}
