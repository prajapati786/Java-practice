package org.example;

import java.util.Scanner;

public class Fibonacci extends Polymorphism {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int name= Sc.nextInt();
        Encap encap=new Encap();
        encap.setAge(name);
        System.out.println(encap.getAge());

        int a,b=1;
        System.out.println("Enter Any Value");
        Scanner sca = new Scanner(System.in);
        a =sca.nextInt();
        for (int i=1;i<=a;i++){
                b= b + i;
        }
        System.out.println("Fibonacci"+a+"is ="+b);
    }

}