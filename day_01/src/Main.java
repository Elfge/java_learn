/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int a;
        a=N/10%10;
        System.out.println(a);
        System.out.println("Hello world!");
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a,b,c,num=0;
        for(n=100;n<1000;n++){
            a=n/10;
            b=n/10%10;
            c=n/10%10%10;
            int i = 0;
            if(i == a * a * a + b * b * b + c * c * c){
                System.out.printf("%d",i);
                num++;
                if(num<=3){
                    System.out.print(",");
                }
            }
        }
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i,j;
        for(i=1;i<=N;i++){
            for(j=1;j<=i-1;j++){
              System.out.print(" ");
            }
            for(j=i;j<=N-i+1;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

}*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name1=sc.next();
        int s1[]=new int[3];
        s1[0]=sc.nextInt();
        s1[1]=sc.nextInt();
        s1[2]=sc.nextInt();
        String name2=sc.next();
        int s2[]=new int[4];
        s2[0]=sc.nextInt();
        s2[1]=sc.nextInt();
        s2[2]=sc.nextInt();
        s2[3]=sc.nextInt();
        System.out.println(name1+":"+getAvg(name1,s1[0],s1[1],s1[2]));
        System.out.print(name2+":"+getAvg(name2,s2[0],s2[1],s2[2],s2[3]));
    }
    public static int getAvg(String name, int... scores){
        int sum=0;
        for(int score:scores){
            sum+=score;
        }
        return sum/scores.length;
    }
}