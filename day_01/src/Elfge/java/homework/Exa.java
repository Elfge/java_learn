package Elfge.java.homework;

public class Exa
{
    String str=new String("I like");
    char[]ch={'j','a','v','a'};
    public static void main(String args[])
    {
        Exa ex=new Exa();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str+" ");
        System.out.print(ex.ch);
    }
    public void change(String str, char ch[])
    {
        str="I hate";
        ch[0]='g';
    }
}