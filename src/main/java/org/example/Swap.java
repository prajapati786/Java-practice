package org.example;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any Value");
        a= scanner.nextInt();
        b= scanner.nextInt();

        System.out.println(" value:"+a+" "+b);

        int x=a;
            a=b;
            b=x;

        System.out.println("Swapping a value:"+a+" "+b);



    }
}
