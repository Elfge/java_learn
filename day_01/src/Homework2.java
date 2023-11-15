import java.util.Scanner;
/*
public class Homework2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num= sc.nextInt();
        int price;
        if(num<30){
            price=50*num;
            System.out.println(price);
        }
        else if(num>=30){
            price=num*(50-2);
            System.out.println(price);
        }
    }
}
*/
public class Homework2{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N= input.nextInt();//输入一个整数
        int R,S;//声明变量
        R=N/10;//求N的十位数字
        S=N%10;//N求余数，取个位数字
        String result1=null;
        String result2=null;
        switch(R) {
            case 1:
                result1 = "Unreadable";
                break;
            case 2:
                result1 = "Barely readable, occasional words distinguishable";
                break;
            case 3:
                result1 = "Readable with considerable difficulty";
                break;
            case 4:
                result1 = "Readable with practically no difficulty";
                break;
            case 5:
                result1 = "Perfectly readable";
                break;
        }
        switch(S){
            case 1:result2="Faint signals, barely perceptible";break;
            case 2:result2="Very weak signals";break;
            case 3:result2="Weak signals";break;
            case 4:result2="Fair signals";break;
            case 5:result2="Fairly good signals";break;
            case 6:result2="Good signals";break;
            case 7:result2="Moderately strong signals";break;
            case 8:result2="Strong signals";break;
            case 9:result2="Extremely strong signals";break;
        }
        System.out.printf(result2+", "+result1+".");
    }
}
