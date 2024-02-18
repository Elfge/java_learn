package Elfge.java.text;
import java.util.Scanner;
public class Text01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int a[][]=new int[n][n];
        for(int k=0;k<q;k++){
            int x= sc.nextInt();
            int y= sc.nextInt();
            String op= sc.nextLine();
            if (op.equals("R")){
                for (int j=y;j<n;j++){
                    a[x-1][j]++;
                }
            } else if (op.equals("L")){
                for (int j=y-2;j>=0;j--){
                    a[x-1][j]++;
                }
            } else if (op.equals("U")){
                for (int i=x-2;i>=0;i--){
                    a[i][y-1]++;
                }
            } else if (op.equals("D")){
                for (int i=x;i<n;i++){
                    a[i][y-1]++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
