package Elfge.java.demo;

import  java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=common(x,y);
        System.out.println(a);
    }
    static int common(int x,int y) {
        if (x == y) {
            return x;
        } else if (x > y) {
            return common(x/2,y);
        }else{
            return common(x,y/2);
            }
    }
}
