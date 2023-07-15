package org.example;

public class TestThrows {
    public static int divideNum() throws IllegalAccessError{
        System.out.println("Fun()");
        throw new IllegalAccessError("demo");
    }

    public static void main(String[] args) {
        TestThrows testThrows=new TestThrows();
        try {
            System.out.println(divideNum());
        }
        catch (IllegalAccessError e){
            System.out.println("Number Can not be Divide By 0");
        }
        System.out.println("Rest of Code");
    }
}
