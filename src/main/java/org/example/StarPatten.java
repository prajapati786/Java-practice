package org.example;

import java.util.Scanner;

public class StarPatten {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a Number");
        Scanner Star=new Scanner(System.in);
        a =Star.nextInt();

        for (int i=1;i<=a;i++){
            for (int j=a;j>=i;j--){
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}
