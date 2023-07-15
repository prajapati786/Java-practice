package org.example;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name=sc.nextLine();
//
//        Encap encap=new Encap();
//        encap.setName(name);
//        System.out.println(encap.getName());
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number");
        a =scanner.nextInt();
        boolean flag =true;
        for (int i = 2; i < a; i++) {
                if(a % i ==0) {
                    flag = false;
                    break;
                }
        }
        if (flag && a>1){
            System.out.println("number is prime");
        }else {
            System.out.println("Number is Not Prime");
        }

    }

}
