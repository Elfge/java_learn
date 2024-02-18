package day06;
/*
实现两个变量的数据交换，不允许定义第三方变量
^异或：
    1.相同的为false，不同的为true
    2.一个数字被同一个数字异或两次，该数不变
 */
public class Test5 {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        int[] ints = arrayChange(arr);
        for (int j = 0; j < ints.length; j++) {
            System.out.println(ints[j]);
        }

    }
    //数据交换
    public static int[] arrayChange(int[] arr){
        //偶数与奇数循环次数不同，需要区分奇偶数
        for (int i = 0; i < arr.length/2; i++) {
            //异或运算进行数据交换
            arr[i]=arr[i]^arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i]^arr[arr.length-1-i];
            arr[i]=arr[i]^arr[arr.length-1-i];
        }
        return arr;
    }
}
