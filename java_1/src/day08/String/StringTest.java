package day08.String;
//String 类常见面试题
public class StringTest {
    public static void main(String[] args) {
//        String s1="abc";
//        String s2="abc";
//        System.out.println(s1==s2);

//        String s1="abc";//常量池中
//        String s2=new String("abc");//在堆内存中开辟新的空间
//        System.out.println(s1==s2);

//        String s1 = "abc";
//        String s2 = "ab";
//        String s3 = s2 + "c";//字符串的拼接操作，通过StringBuilder拼接后，调用toString方法转换为String类型
//        System.out.println(s1 == s3);

        //Java存在常量优化机制
        String s1 = "abc";
        String s2 = "a" + "b" + "c";
        System.out.println(s1 == s2);
    }
}
