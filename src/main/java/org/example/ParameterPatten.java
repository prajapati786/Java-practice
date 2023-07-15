package org.example;

import java.util.Scanner;

public class ParameterPatten {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number");
        a =scanner.nextInt();

        for (int i=0;i<a;i++){

            for (int j=a-i;j>1;j--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }

        }
        System.out.println();
    }
}
