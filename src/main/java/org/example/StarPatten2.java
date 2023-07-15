package org.example;

import java.util.Scanner;

public class StarPatten2 {
    public static void main(String[] args) {
        int a,i,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        a = scanner.nextInt();

        for (i = 1; i <= a; i++) {
            for (j = 2*(a-i); j >= 1; j--){
                System.out.print(" ");

            }
            for (j=1;j<=i;j++){
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
