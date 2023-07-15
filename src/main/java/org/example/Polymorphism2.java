package org.example;

public class Polymorphism2 extends Polymorphism {
    @Override
    public Polymorphism2 covariant(){
        super.covariant();
        System.out.println("Tuesday");
        return this;
    }
//    public int data(int a, int b){
////        System.out.println();
//        return 12;
//    }
//    public static String data(int a){
//        return "vivek2003";
//    }

    public static void main(String[] args) {
//        System.out.println(data(2));
        Polymorphism2 p=new Polymorphism2();
        p.covariant();
//
//        System.out.println(p.data(2,0));
//        System.out.println(p.data(1));
    }
}