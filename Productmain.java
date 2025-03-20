import java.util.Scanner;

class Product{
    int pcode;
    String pname;
    int price;
    Product( int pcode,String pname, int price){
        this.pname=pname;
        this.pcode=pcode;
        this.price=price;
    }

    int price(){
        return price;
    }
}

public class Productmain {
    public static void main(String[] args) {
        int min_price=1000000000;
        int index=0;
        Product prod[]=new Product[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<prod.length;i++){
            System.out.println("Enter product code");
            int pcode=sc.nextInt();
            System.out.println("Enter product name");
            String pname=sc.next();
            System.out.println("Enter product price"); 
            int price=sc.nextInt();
            prod[i]=new Product(pcode,pname,price);
            if(prod[i].price()<min_price){
                min_price=prod[i].price;
                index=i;
            }
        }
        sc.close();
        System.out.println("The product with the lowest price is: "+prod[index].pname+" with price: "+min_price);
    }
        
}
