package day06;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={19,28,37,46,50,19,19};//数组中存在多个相同元素，但索引不同
        System.out.println("请输入");
        int num=sc.nextInt();
        int i[] = arrayPosition(num,arr);
        if(i.length==0){
            System.out.println("您查找的数组元素不存在");
        }else{
            for (int j = 0; j < i.length; j++) {
                System.out.println(i[j]);
            }
        }
    }
    /*
    查找元素在数组中的索引位置
    已知数组arr={19，28，37，46，50}
    键盘录入一个数据，查找该数据在数组中的索引。
    并在控制台输出找到的索引值。

     */
    public static int[] arrayPosition(int num,int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                count++;
            }
            }
        int[] index=new int[count];
        int a=0;
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
                index[a]=i;
                a++;
            }
        }
        return index;
    }
}
