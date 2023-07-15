package org.example;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class CoffeeMaker {

    public static void main(String[] args) {
        CoffeeList coffeeList=new CoffeeList();
        int i = 0, sum;
//        while (i == 0) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Select type of coffee you want ...!");
            System.out.print("1 . Choose Mocha For You \n" +
                    "2. Choose Latte For You \n " +
                    "3. Choose Espresso For You \n" +
                    "4. Exit:0" );

//            System.out.println("Enter Your Choice");
//            sum = scanner.nextInt();
            int myChoice = scanner.nextInt();
            switch (myChoice) {
                case 1 :
                    System.out.println("How Much Milk you want:");
                    int milk= scanner.nextInt();
                    System.out.println("How Much Sugar spoon You Have:");
                    int sugar=scanner.nextInt();
                    System.out.println("How Much cocoa cup You Have:");
                    int cocoa=scanner.nextInt();
                    System.out.println(coffeeList.Mocha(milk,sugar,cocoa));
                    break;
                case 2:
                    System.out.println("How Much Milk you want:");
                    int milk1= scanner.nextInt();
                    System.out.println("How Much Sugar spoon You Have:");
                    int sugar1=scanner.nextInt();
                    System.out.println("How Much cocoa cup You Have:");
                    int cocoa1=scanner.nextInt();
                    System.out.println("How Much Chocolate spoon You Have:");
                    int spoon1=scanner.nextInt();
                    System.out.println(coffeeList.Latte(milk1,sugar1,cocoa1,spoon1));
                    break;
                case 3:
                    System.out.println("How Much Milk you want:");
                    int milk2= scanner.nextInt();
                    System.out.println("How Much Sugar spoon You Have:");
                    int sugar2=scanner.nextInt();
                    System.out.println("How Much cocoa cup You Have:");
                    int cocoa2=scanner.nextInt();
                    System.out.println(coffeeList.Espresso(milk2,sugar2,cocoa2));
                    break;
                case 4:
                    System.exit(0);
            }
    }
}
