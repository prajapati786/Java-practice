package org.example;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        int add, revers=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        add = scanner.nextInt();
        int j=0;

        while (add>0){
                j= add % 10;
                revers=revers*10+j;
                add /=10;

        }
        System.out.println("reverse "+add+" is " + revers);
    }
}
