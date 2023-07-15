package org.example;

import java.util.Scanner;

public class Encap {
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner person=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=person.next();
        System.out.println("Enter your Age");
         int age =person.nextInt();

        System.out.println(name);
        System.out.println(age);
    }

}
