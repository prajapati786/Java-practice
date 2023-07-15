package org.example;

import java.util.Scanner;

public class Examples {
    public static int star(int a,int b){
        int c=0;
        if (c<10){
            throw new ArithmeticException();
        }else {
            c = a+b;
            System.out.println(c);
        }
        return c;
    }
    public static void main(String[] args) {
        Examples examples = new Examples();
        try {
            System.out.println(examples.star(12,13));
        }
        catch (Exception e){
            System.out.println(e);
        }

//        int a,b;
//        float x= 7 / 4.0f * 9 / 2.0f;
//        System.out.println(x);
//        a=7;
//        b=++a*8;
//        System.out.println(b);
//        char ch='a';
//        System.out.println(++ch);

        //type Casting***
//        char grad='B';
//        grad=(char) (grad +8);
//        System.out.println(grad);
//
//        grad=(char) (grad -8);
//        System.out.println(grad);
//        Scanner scanner=new Scanner(System.in);
//        int a =scanner.nextInt();
//        System.out.println(a>8);
//        int v=100,u=50,a=2,s=2;
//        int d=(v*v -u*u)/(2*a*s);
//        System.out.println(d);
//        String name=new String("Hello My Name is V");
//        System.out.println(name);
//        int a = 6;
//        float b=5.12345f;
//        System.out.printf("The Value Of a is %d And value is:%f",a,b);

//        Scanner scanner=new Scanner(System.in);
//        String c =scanner.nextLine();
//        System.out.println(c);

    }
}
