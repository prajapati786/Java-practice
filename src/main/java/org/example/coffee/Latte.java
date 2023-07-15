package org.example.coffee;

public class Latte extends Coffee {
    private int milk;

    private int darkRoast;

    private int price=200;

    public void setMilk(int milk){
        this.milk=milk;
    }
    public void setDarkRoast(int darkRoast){
        this.darkRoast=darkRoast;
    }
    public int getMilk(){
        return milk;
    }
    public int getDarkRoast(){
        return darkRoast;
    }

}
