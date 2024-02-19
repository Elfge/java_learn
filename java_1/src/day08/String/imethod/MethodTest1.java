package day08.String.imethod;

public class MethodTest1 {
    /*
    String类型中用于比较的方法：
        public boolean equals（Object anObject）将此字符串与指定对象比较
        public boolean equalsIgnoreCase(String anotherString)将字符串与另一个字符串比较，不考虑大小写

     */
    public static void main(String[] args) {
        String s1="abc";
        String s2="ads";
        System.out.println(s1.equals("abc"));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
