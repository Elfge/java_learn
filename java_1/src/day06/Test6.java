package day06;

import java.util.Scanner;
/*
评委打分问题：去掉最高分和最低分求平均值
1.不考虑数据校验
2.校验键盘录入的数据是否是1-100之间
3.抽取方法
 */
public class Test6 {
    public static void main(String[] args) {
        int[] arr = getInts();
        int sum = getSum(arr);
        int max = getMax(arr);
        int min = getMin(arr);
        double avg=((sum-max-min)*1.0)/(arr.length-2);
        System.out.println(avg);
    }
//数组求最小值
    private static int getMin(int[] arr) {
        int min= arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]<min){
                min= arr[j];
            }
        }
        return min;
    }
    //数组求最大值
    private static int getMax(int[] arr) {
        int max= arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]>max){
                max= arr[j];
            }
        }
        return max;
    }
//数组求和
    private static int getSum(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        return sum;
    }
/*
初始化数组的值
 */
    private static int[] getInts() {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" +(i+1)+
                    "位评委打分");
            int input=sc.nextInt();
            if(input>=0&&input<=100){
                arr[i]=input;
            }else {
                System.out.println("您输入的数据有误，请重新输入");
                i--;//保证打分数据错误时，可以重新打分
            }
        }
        return arr;
    }
}
