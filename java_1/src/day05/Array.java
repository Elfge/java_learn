package day05;

public class Array {
    public static void main(String[] args) {
        int[] arr={100,50,20,90,90};
        int score = getScore(arr);
        System.out.println(score);
    }
    /*对数字中偶数元素做求和操作
    */
    public static void getsum(int[] arry){
        //定义求和变量，进行累加操作
        int sum=0;
        for (int i = 0; i < arry.length; i++) {
            if(arry[i]%2==0){
                sum=sum+arry[i];
            }
        }
        System.out.println(sum);
    }
    /*
    已知数组元素为{5，44，33，55，22}，找出其中的最大值并打印在控制台
    */
    public static int getMax(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    /*
    已知班级学生成绩为
    int[] arr={100,50,20,90,90}
    1.找出数组最大值并打印
    2.找出数组最小值并打印
    3.求总成绩并打印
    4.计算平均值
    5.统计低于平均值的元素个数
     */
    public static int getScore(int[] arr){
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        for (int j = 0; j < arr.length; j++) {
            sum+=arr[j];
        }
        System.out.println(sum);
        int f=0;
        double avg=(sum*1.0)/ arr.length;
        System.out.println(avg);
        for (int k = 0; k < arr.length; k++) {
            if (arr[k]<avg){
                f++;
            }
        }
        return f;
    }
}
