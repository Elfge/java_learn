package day06;

import java.util.Random;
import java.util.Scanner;

/*
随机产生验证码
        请从26个英文字母（大小写都包含），以及数字0-9中，随机产生一个5位的字符串验证码并打印在控制台
        效果：uYq8I，3r4Zj
        从数组中随机抽取一个元素：
            根据数组长度，随机产生一个数，以该数作为索引获取元素
 */
public class Test7 {
    public static void main(String[] args) {
        char[] ch = setChars();
        Result result = getCheckCode(ch);
        check(result);
    }
//对验证码进行验证
    private static void check(Result result) {
        System.out.println("请输入验证码");
        String inputcheckCode= result.sc().next();
        if(inputcheckCode.equals(result.checkCode())){
            System.out.println("验证码正确");
        }else{
            System.out.println("验证码错误");
        }
    }

    //获取验证码
    private static Result getCheckCode(char[] ch) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        String checkCode="";
        for(int i=0;i<5;i++){
            int ra= r.nextInt(ch.length);
            checkCode+= ch[ra];
        }
        System.out.println("产生的验证码为："+checkCode);
        Result result = new Result(sc, checkCode);
        return result;
    }

    private record Result(Scanner sc, String checkCode) {
    }

    //字符数组的设置
    private static char[] setChars() {
    /*    char[] ch={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
    'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
    '0','1','2','3','4','5','6','7','8','9'};

     */
        char[] ch=new char[26+26+10];
        int index=0;
        for(char c = 'a';c<='z';c++){
            ch[index]=c;
            index++;
        }
        for(char c = 'A';c<='Z';c++){
            ch[index]=c;
            index++;
        }
        for(char c = '0';c<='9';c++){
            ch[index]=c;
            index++;
        }
        return ch;
    }
}
