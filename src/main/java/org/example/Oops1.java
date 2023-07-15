package org.example;

public class Oops1 extends Oops {

    String os;
    int ram;
    int sdCardSize;
    Oops1(){
        System.out.println("Class B Constructed");
    }

    void SetProductDetail(int pid,String name,int price,String os,int ram,int sdCardSize){
        this.pid = pid;
        this.name=name;
        this.price=price;
        this.os=os;
        this.ram=ram;
        this.sdCardSize=sdCardSize;
        System.out.println("Data Written Object");
    }
    void ShowProductDetail(){
        System.out.println("Product ID:"+pid+"");
        System.out.println("Product name:"+name+"");
        System.out.println("Product price:"+price+"");
        System.out.println("Product os:"+os+"");
        System.out.println("Product ram:"+ram+"");
        System.out.println("Product sdCardSize:"+sdCardSize+"");
        System.out.println("Data Product ");
    }

    public static void main(String[] args) {
    Oops1 extend=new Oops1();
    extend.SetProductDetail(401,"Iphone",150000,"Ios",12,128);
    extend.ShowProductDetail();
//    extend.SetProductDetail(301,"SamSung",20000);
//    extend.ShowProductDetail();
//        B product=new B();
////        System.out.println(product);
//        product.SetProductDetail(122,"Vivo",12000);
//        product.ShowProductDetail();
//        System.out.println();
//
//        B product1=new B();
////        product1.pid=201;
//        product1.setPid(202);
//        product1.name="Nike";
//        product1.price=1500;
//        product1.ShowProductDetail();
    }
}
