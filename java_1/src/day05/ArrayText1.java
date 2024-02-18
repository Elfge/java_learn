package day05;

public class ArrayText1 {
    public static void main(String[] args) {
        printArry();
    }
    /*
        遍历并打印二维数组中的元素
        已知一个二维数组arr={{11,22,33},{33,44,55}}
    */
    public static void printArry(){
    int arr[][]={
            {11,22,33},
            {33,44,55}
    };
    int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
