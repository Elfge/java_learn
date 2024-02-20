package day08.String;

public class StringBuilderTest2 {
    /*
    需求：
        定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回
        调用该方法，并在控制台输出结果

        例如：
           数组int[] arr={1,2,3};
           执行方法后的输出结果为[1,2,3]
     */
    public static void main(String[] args) {
        int[] arr={1,2,3,};
        String s = arrayToString(arr);
        System.out.println(s);
    }
    public static String arrayToString(int[] arr){
        StringBuilder sb=new StringBuilder("[");
        for (int i = 0; i < arr.length-1; i++) {
            sb.append(arr[i]).append(",");

        }
        sb.append(arr[arr.length-1]).append("]");

        return sb.toString();
    }
}
