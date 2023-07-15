package org.example;

public class CoffeeList implements TypeCoffee{

    @Override
    public String Mocha(int milk, int sugar, int cocoa) {
        System.out.println("plz wait making Mocha");
        System.out.println("Adding " + milk + " cup of milk");
        System.out.println("Adding " + sugar + " spoon of sugar");
        System.out.println("Adding " + cocoa + " cup of cocoa");
        return "Tack Your Mocha Coffee";
    }

    @Override
    public String Latte(int milk, int sugar, int cocoa, int Spoon) {
        System.out.println("plz wait making Latte");
        System.out.println("Adding " + milk + " cup of milk");
        System.out.println("Adding " + sugar + " spoon of sugar");
        System.out.println("Adding " + cocoa + " cup of cocoa");
        System.out.println("Adding " + Spoon + " cup of Chocolate");
        return "Tack Your Latte Coffee";
    }

    @Override
    public String Espresso(int milk, int sugar, int cocoa) {
        System.out.println("plz wait making Espresso");
        System.out.println("Adding " + milk + " cup of milk");
        System.out.println("Adding " + sugar + " spoon of sugar");
        System.out.println("Adding " + cocoa + " cup of cocoa");
        return "Tack Your Espresso Coffee";
    }
//    @Override
//    public String Latte(int milk, int sugar) {
//        System.out.println("plz wait making Latte");
//        System.out.println("Adding" + milk + "cup of milk");
//        System.out.println("Adding" + sugar + "spoon of sugar");
//        return null;
//    }

//    @Override
//    public String Latte(int milk, int sugar, int cocoa) {
//        System.out.println("plz wait making Mocha");
//        System.out.println("Adding" + milk + "cup of milk");
//        System.out.println("Adding" + sugar + "spoon of sugar");
//        System.out.println("Adding" + cocoa + "cup of cocoa");
//        return null;
//    }

//    @Override
//    public String Latte(int milk, int sugar, int cocoa) {
//
//        return null;
//    }


}
