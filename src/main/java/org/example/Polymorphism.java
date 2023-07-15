package org.example;

import javax.xml.crypto.Data;
import java.awt.geom.Area;

public class Polymorphism {
    int c=0;
    public Polymorphism covariant(){
        System.out.println("Monday");
        return this;
    }
//    public  int data(int a,int b){
//        if (b==0){
//            throw new ArithmeticException();
//        }else{
//            c=a/b;
//            System.out.println(c);
//            return c;
//        }
//    }
    public static String data(int a){
        return "vivek2806";
    }

    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
//        System.out.println(polymorphism.data(10,0));
//        System.out.println(polymorphism.data(1,2));
        System.out.println(polymorphism.data(1));


    }

}
