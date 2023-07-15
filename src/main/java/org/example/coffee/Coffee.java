package org.example.coffee;

public class Coffee {
    private int water = 100;// Water 100ml
    private int coffeePowder = 3;//cup 1 coffeePowder

    private int quantity;

    private int price=100;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setCoffeePowder(int coffeePowder) {
        this.coffeePowder = coffeePowder;
    }

    public int getWater() {
        return water;
    }

    public int getCoffeePowder() {
        return coffeePowder;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "water=" + water +
                ", coffeePowder=" + coffeePowder +
                '}';
    }
}
