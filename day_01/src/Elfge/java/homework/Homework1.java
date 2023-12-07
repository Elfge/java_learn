package Elfge.java.homework;

import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int C, S;
        C = 2 * a + 2 * b;
        S = a * b;
        System.out.printf("%d %d",C,S);
    }
}
