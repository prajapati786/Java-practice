package org.example;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int a;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter any Number ");
        a=scanner.nextInt();
        if(a % 2 ==0){
            System.out.println("Enter Number is Even");
        }else {
            System.out.println("Enter Number is Odd");
        }
    }
}
