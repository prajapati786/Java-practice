package org.example;

public class SimpleBlock {
    public static void main(String[] args) {
        SimpleBlock simpleBlock = new SimpleBlock();
//        System.out.println("jhsaglfjhf jsdflja");
    }

    SimpleBlock() {
        System.out.println("Class Object here");
    }

    {
        System.out.println("instance block");
    }

    static {
        System.out.println("Static Block");
    }
//    public static String type(int a,int b){
//        return "vivek";
//    }
//    public static int type(int a,int b,int c){
//        return 123;
//    }
//
//    public static void main(String[] args) {
//        SimpleBlock simpleBlock = new SimpleBlock();
//        System.out.println(simpleBlock.type(2,3,6));
//
//    }
}