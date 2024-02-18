package day06;

public class Test3 {
    public static void main(String[] args) {
        int[] arr1={11,22,33};
        int[] arr2={11,22,33};
        boolean compare = arrayCompare(arr1,arr2);
        System.out.println(compare);
    }

    /*
    判断数组元素是否相同
    要求：长度，内容，顺寻完全相同
     */
    public static boolean arrayCompare(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
