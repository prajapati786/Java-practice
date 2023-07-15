package org.example;

import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name= scanner.nextLine();
        Encap encap = new Encap();

        encap.setName(name);
        System.out.println(encap.getName());


        int a,b,c=0;
        Scanner choose = new Scanner(System.in);
        System.out.println("1:+Addition");
        System.out.println("2:-Subtraction");
        System.out.println("3:*Multiplication");
        System.out.println("4:Division");
        System.out.println("Enter your choice");
       int select =choose.nextInt();
        System.out.println("Enter number 1");
        a = choose.nextInt();
        System.out.println("Enter number 2");
        b = choose.nextInt();

        switch (select){
            case 1:
                c=a+b;
                System.out.println(c);
                break;

            case 2:
                c=a-b;
                System.out.println(c);
                break;

            case 3:
                c=a*b;
                System.out.println(c);
                break;

            case 4:
                c=a/b;
                System.out.println(c);
                break;
        }
    }
}
