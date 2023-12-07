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

}
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
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] eqn=new double[3];
        eqn[0]=sc.nextDouble();
        eqn[1]=sc.nextDouble();
        eqn[2]=sc.nextDouble();
        double[] roots=new double[2];
        for(int i=0;i<3;i++){
            if(sc.hasNextDouble()){
                eqn[i]=sc.nextDouble();
            }else{
                System.out.print("Wrong Format");
                return;
            }
        }
        int s=solveQuadratic(eqn,roots);
        if(s==0){
            System.out.print("The equation has no roots");
        }else if(s==1){
            System.out.print("The equation has one root:%。4f%n",roots[0]);
        }else{
            System.out.print("The equation has two roots:%.4f and %.4f%n",roots[0],roots[1]);
        }
    }
    public static int solveQuadratic(double[] eqn,double[] roots){
        double a=eqn[0];
        double b=eqn[1];
        double c=eqn[2];
        double g=b*b-4*a*c;
        if(g<0){
            return 0;
        }else if(g==0){
            roots[0]=-b/2*a;
            return 1;
        }else {
            roots[0]=(-b+Math.sqrt(g))/(2*a);
            roots[1]=(-b-Math.sqrt(g))/(2*a);
            return 2;
        }

    }
}*/
class Book {

    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        this.title=bookTitle;
        this.borrowed=false;
    }
    // Marks the book as rented
    public void rented() {
        this.borrowed=true;
    }
    // Marks the book as not rented
    public void returned() {
        this.borrowed=false;
    }
    public boolean isBorrowed() {
        return this.borrowed;
    }
    // Returns the title of the book
    public String getTitle() {
        return this.title;
    }
}
public class Main {
    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}
