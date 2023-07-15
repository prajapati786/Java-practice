package org.example;

import java.util.Scanner;

public class LargestAmong {
    public static void main(String[] args) {
        int a,b;
        Scanner Largest= new Scanner(System.in);
        System.out.println("Enter Any Value");
        a =Largest.nextInt();
        b =Largest.nextInt();

        if(a>b){
            System.out.println(a);

        }
        else {
            System.out.println(b);
        }
    }
}
