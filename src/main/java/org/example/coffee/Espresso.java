package org.example.coffee;

public class Espresso extends Coffee{
    private int cocoaPowder;

    private int sugar;

    public void setCocoaPowder(int cocoaPowder){
        this.cocoaPowder=cocoaPowder;
    }
    public void setSugar(int sugar){
        this.sugar=sugar;
    }
    public int getSugar(){
        return sugar;
    }
    public int getCocoaPowder(){
        return cocoaPowder;
    }
}
