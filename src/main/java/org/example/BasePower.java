package org.example;

import java.util.Scanner;

public class BasePower {
    public static void main(String[] args) {
        int base,power,c=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Base Number");
        base=scanner.nextInt();
        System.out.println("Enter Power Number");
        power=scanner.nextInt();

        for (int i=1;i<=power;i++){
            c *=base;
        }
        System.out.println("Result:"+c);
    }
}
