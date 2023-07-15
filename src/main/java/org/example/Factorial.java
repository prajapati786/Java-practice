package org.example;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int a,b=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Positive Integer");
        a=scanner.nextInt();
        for (int i=1;i<=a;i++){
            b *=i;
        }
        System.out.println("Factorial:"+b);
    }
}
