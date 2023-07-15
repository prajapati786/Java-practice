package org.example.coffee;

public   class Mocha extends Coffee {
    private int milk;//150 ml
    private int sugar;
    public void setMilk(int milk) {
        this.milk = milk;
    }

    public  void setSugar(int sugar){
        this.sugar=sugar;
    }
    public int getSugar(){
        return sugar;
    }
    public int getMilk() {
        return milk;
    }


//        Mocha mocha=new Mocha();
//        mocha.setWater(100);
//        mocha.setSugar(3);
//        mocha.setCoffeePowder(1);
//        mocha.setMilk(150);
//        System.out.println("Water is  " +mocha.getWater()+"  ml for MoCha");
//        System.out.println("Sugar is  " +mocha.getSugar()+"  Spoon in Mocha");
//        System.out.println("CoffeePowder is  " +mocha.getCoffeePowder()+"  Cup in Mocha ");
//        System.out.println("Milk is  " +mocha.getMilk()+"  ml in Mocha");





}
