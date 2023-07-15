package org.example;

public class Oops {
    Oops(){
        System.out.println("parent Constructed");
    }
     int pid;
    String name;
    int price;
   void SetProductDetail(int pid,String name,int price){
        this.pid = pid;
        this.name=name;
        this.price=price;
        System.out.println("Data Written Object");
    }
    void ShowProductDetail(){
        System.out.println("Product ID:"+pid+"");
        System.out.println("Product name:"+name+"");
        System.out.println("Product price:"+price+"");
        System.out.println("Data Product ");
    }
    void setPid(int pid){
       this.pid=pid;
    }
    int getPid(){
       return pid;
    }
    public static void main(String[] args) {
//       int n=5;
//       for (int i=0;i<n;i++) {
//           System.out.println(2 * i + 1);
//       }
        for (int i=5;i!=0;i--){
            System.out.println(i);
            System.out.println("java loop");
            if (i==2){
                System.out.println("End the loop");
                break;
            }
        }

//       int i=0;
//        do {
//            System.out.println(i);
//            i++;
//        }while (i<5);
        //1
//        String a="Vivos1";
//        a=a.toLowerCase();
//        System.out.println(a);
        //2
//        String tex="My Name Is";
//        tex =tex.replace(" ","...");
//        System.out.println(tex);

        //3
//        String latter="Dear </name/> ,thanks a lot";
//        latter=latter.replace("</name/>","Vivek");
//        System.out.println(latter);

        //4
//        String detect="This String Contain   Is To    Detect a Space ";
//        System.out.println(detect.indexOf("   "));
//        System.out.println(detect.indexOf("    "));

//        String myletter = "hii i am a vivek \n\t, What is your Address,\nBajipura";
//        System.out.println(myletter);

//
//        System.out.println("Enter your Name");
//        int a=scanner.nextInt();
////        String var="vivek";
//        switch (a){
//
//            case 1 :
//                System.out.println("your name is Dhaval");
//                break;
//
//            case 2:
//                System.out.println("your name is vivek");
//                break;
//
//            case 3:
//                System.out.println("your name is Fenil");
//                break;
//            default:
//                System.out.println("What is your Name");
//        }
//        System.out.println("Thanks");

//        int a=10;
//        if(a == 11){
//            System.out.println("i Am 11");
//        }else {
//            System.out.println("i am not 11");
//        }
//        int a,b,c;
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter Subject 1 marks");
//        a=scanner.nextInt();
//        System.out.println("Enter Subject 2 marks");
//        b=scanner.nextInt();
//        System.out.println("Enter Subject 3 marks");
//        c=scanner.nextInt();
//        float avg=(a+b+c)/3.0f;
//        System.out.println("Your Overall Percentage is :"+ avg +" ");
//        if (avg>=40 && a>=33 && b>=33 && c>=33){
//            System.out.println("Congratulation,You Are Pass in This Exam");
//        }else {
//            System.out.println("You are fail In This Exam");
//        }


//        float tax=0;
//        float income =scanner.nextFloat();
//        if(income <=2.5 ){
//                tax = tax + 0;
//        }else if (income>2.5f && income <= 5f){
//                tax = tax + 0.05f * (income - 2.5f);
//        }else if (income >5f && income <= 10.0f){
//                tax =tax +0.05f *(5.0f - 2.5f);
//                tax =tax +0.2f *(income - 5f);
//        }else if (income>10.0f){
//            tax =tax +0.05f *(5.0f - 2.5f);
//            tax =tax +0.2f *(10.0f - 5f);
//            tax =tax +0.3f *(income - 10.0f);
//
//        }
//        System.out.println("total tax paid by Employee is:"+ tax);
//        System.out.println("Which day is Today");
//        int a=scanner.nextInt();
//        switch (a){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//
//            case 6:
//                System.out.println("Saturday");
//                break;
//
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Enter proper Number");
//        }
//        int year;
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter An Year:");
//        year=scanner.nextInt();
//        if ((1200 % 4 ==0 )&&(year % 100!=0)||(year % 400 ==0)){
//            System.out.println("leap year");
//        }else {
//            System.out.println("not a leap year");
//        }

//        Scanner scanner=new Scanner(System.in);
//        String website=scanner.next();
//        if (website.endsWith(".org")){
//            System.out.println("This is an Original Website");
//        } else if (website.endsWith(".com")) {
//            System.out.println("This is Commercial Website");
//        }else if (website.endsWith(".in")) {
//            System.out.println("This is Indian Website");
//        }
//        int i = 100;
//        while (i<=200){
//            System.out.println(i);
//            i++;
//        }
    }

}
