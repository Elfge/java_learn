package day06;

/*
逢7过游戏
    1.获取1-100之间的数字
    2.拆分十位与个位
    3.if判断
*/

public class Test1 {
    public static void main(String[] args) {
        jeepSeven();
    }
    public static void jeepSeven(){
        for (int i=0;i<100;i++){
            int num=i+1;
            int ge=num%10;
            int shi=num/10;
            if(ge==7||shi==7||num%7==0){
                System.out.println("过");
            }else{
                System.out.println(num);
            }
        }
    }
}
