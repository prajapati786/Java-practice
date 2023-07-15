package org.example.coffee;

public class Filter extends Coffee {
    private int milk;
    private int sugar;

    public void setMilk(int milk){
        this.milk=milk;
    }
    public  void setSugar(int sugar){
        this.sugar=sugar;
    }
    public int getSugar(){
        return sugar;
    }
    public int getMilk(){
        return milk;
    }
}
