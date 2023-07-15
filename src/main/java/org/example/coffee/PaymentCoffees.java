package org.example.coffee;

public class PaymentCoffees {
    private int blackCoffee;
    private int espresso;
    private int filter;
    private int latte;
    private int mocha;

    private Coffee coffee;

    public PaymentCoffees() {

    }


    public int billingCounter(String coffeeType) {
        int res = 0;
        if (coffeeType.equals(CoffeeType.BALCKCOFFEE)) {

        }
        return res;
    }

    public void setBlackCoffee(int blackCoffee) {
        this.blackCoffee = blackCoffee;
    }

    public void setEspresso(int espresso) {
        this.espresso = espresso;
    }

    public void setFilter(int filter) {
        this.filter = filter;
    }

    public void setLatte(int latte) {
        this.latte = latte;
    }

    public void setMocha(int mocha) {
        this.mocha = mocha;
    }

    public int getBlackCoffee() {
        return blackCoffee;
    }

    public int getEspresso() {
        return espresso;
    }

    public int getFilter() {
        return filter;
    }

    public int getLatte() {
        return latte;
    }

    public int getMocha() {
        return mocha;
    }
}
