package org.example;

import java.util.Scanner;

public class Swaping {
    public static void main(String[] args) {
        int x,y,t;
        Scanner swapping= new Scanner(System.in);
        System.out.println("Enter x and y");
        x= swapping.nextInt();
        y= swapping.nextInt();
        System.out.println("before swapping number:"+x+" "+y);


        t=x;
        x=y;
        y=t;
        System.out.println("After swapping:"+x+" "+y);
        System.out.println();






    }
}
