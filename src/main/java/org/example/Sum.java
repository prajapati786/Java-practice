package org.example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int n,f=1;
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial of "+ n+"is ="+ f);
    }

//    public static int  factorial(int n){
//        int r=1;
//        for (int i=1;i<=n;i++){
//            r=r*i;
//        }
//        return r;
//    }
}
