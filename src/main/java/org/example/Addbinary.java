package org.example;

import java.util.Scanner;

public class Addbinary {
    public static void main(String[] args) {
        String a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter First Value");
        a=scanner.nextLine();
        System.out.println("Enter First Value");
        b=scanner.nextLine();

        int i=Integer.parseInt(a,2);
        int q=Integer.parseInt(b,2);
        int sum=i+q;

        String result=Integer.toBinaryString(sum);
        System.out.println(result);


    }
}
