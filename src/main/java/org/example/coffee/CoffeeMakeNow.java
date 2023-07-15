package org.example.coffee;

import java.util.Scanner;

public class CoffeeMakeNow {
    public static void main(String[] args) throws InterruptedException {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println(".........Select Type Of Coffee You Want.......!");
        System.out.println("1.SELECT For * BlackCoffee *!\n" +
                           "2.SELECT For * Espresso * Coffee!\n" +
                           "3.SELECT For * Filter * Coffee!\n" +
                           "4.SELECT For * Latte * Coffee!\n" +
                           "5.SELECT For * Mocha * Coffee!\n" +
                           "6.Exit!");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("How Many Water You Want(ml):");
                int water = scanner.nextInt();
                System.out.println("How Many CoffeePowder You Want(in CUP):");
                int coffeePowder = scanner.nextInt();
                System.out.println("How Many BlackCoffee You Want");
                int quantity = scanner.nextInt();
                Coffee coffee = new Coffee();
                coffee.setWater(water);
                coffee.setQuantity(quantity);
                coffee.setCoffeePowder(coffeePowder);
                System.out.println("Please Wait Making BlackCoffee!");
                System.out.println("Add " + coffee.getWater() + "ml Water!");
                System.out.println("Add " + coffee.getCoffeePowder() + " cup CoffeePowder!");
                System.out.println("Order Total "+coffee.getQuantity() + "  BlackCoffee");
                System.out.println("Wait moment to ready your coffee.");
                coffeeBoilSleepTime();
                System.out.println("Your BlackCoffee Is READY !------");
                PaymentCoffees paymentCoffees = new PaymentCoffees();
                paymentCoffees.setBlackCoffee(quantity*199);
                paymentCoffees.billingCounter(CoffeeType.BALCKCOFFEE.toString());
                System.out.println("Please Pay your BlackCoffee bill: " + paymentCoffees.getBlackCoffee() + " rs");
                int payment = scanner.nextInt();
                if (payment == paymentCoffees.getBlackCoffee()) {
                    System.out.println("Your Payment Is Successfully " + payment + "rs");
                } else {
                    System.out.println("Payment Fail , Pay Again");
                }
                break;
            case 2:
                System.out.println("How Many Spoon CocoaPowder You Want!");
                int cocoaPowder = scanner.nextInt();
                System.out.println("How Many Spoon Sugar You Want!");
                int sugar = scanner.nextInt();
                Espresso espresso = new Espresso();
                espresso.setCocoaPowder(cocoaPowder);
                espresso.setSugar(sugar);
                System.out.println("Please Wait Making Espresso Coffee!");
                System.out.println("Add " + espresso.getWater() + "ml Water!");
                System.out.println("Add " + espresso.getCoffeePowder() + " cup CoffeePowder!");
                System.out.println("Add " + espresso.getCocoaPowder() + " spoon CocoaPowder!");
                System.out.println("Add " + espresso.getSugar() + " spoon Sugar!");
                coffeeBoilSleepTime();
                System.out.println("Your Espresso Coffee Is READY!------");
                break;
            case 3:
                System.out.println("How Many Milk You Want(ml):");
                int milk = scanner.nextInt();
                System.out.println("How Many Spoon Sugar You Want!");
                int sugar1 = scanner.nextInt();
                Filter filter = new Filter();
                filter.setMilk(milk);
                filter.setSugar(sugar1);
                System.out.println("Please Wait Making Filter Coffee!");
                System.out.println("Add " + filter.getWater() + "ml Water!");
                System.out.println("Add " + filter.getCoffeePowder() + " cup CoffeePowder!");
                System.out.println("Add " + filter.getMilk() + "ml Milk!");
                System.out.println("Add " + filter.getSugar() + " spoon Sugar!");
                coffeeBoilSleepTime();
                System.out.println("Your Filter Coffee Is READY!------");
                break;
            case 4:
                System.out.println("How Many Milk You Want(ml):");
                int milk1 = scanner.nextInt();
                System.out.println("How Many cup darkRoast You Want!");
                int darkRoast = scanner.nextInt();
                Latte latte = new Latte();
                latte.setMilk(milk1);
                latte.setDarkRoast(darkRoast);
                System.out.println("Please Wait Making Latte Coffee!");
                System.out.println("Add " + latte.getWater() + "ml Water!");
                System.out.println("Add " + latte.getCoffeePowder() + " cup CoffeePowder!");
                System.out.println("Add " + latte.getMilk() + " ml milk!");
                System.out.println("Add " + latte.getDarkRoast() + " cup DarkRoast!");
                coffeeBoilSleepTime();
                System.out.println("Your Latte Coffee Is READY!------");
                break;
            case 5:
                System.out.println("How Many Milk You Want (ml):");
                int milk2 = scanner.nextInt();
                System.out.println("How Many spoon Sugar you Want!");
                int sugar2 = scanner.nextInt();
                Mocha mocha = new Mocha();
                mocha.setMilk(milk2);
                mocha.setSugar(sugar2);
                System.out.println("Please Wait Making Mocha Coffee!");
                System.out.println("Add " + mocha.getWater() + "ml Water!");
                System.out.println("Add " + mocha.getCoffeePowder() + " cup CoffeePowder!");
                System.out.println("Add " + mocha.getMilk() + " ml milk!");
                System.out.println("Add " + mocha.getSugar() + " spoon Sugar!");
                coffeeBoilSleepTime();
                System.out.println("Your Mocha Coffee Is READY!------");
                break;
            case 6:
                System.exit(0);
        }
    }

    public static void coffeeBoilSleepTime() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.print("-");
            Thread.sleep(1000);
        }
    }
}
