package Ameghaa;
import java.util.Scanner;

public class _1product{
    int pcode;
    String pname;
    int price;
    _1product(int pcode,String pname,int price)
    {
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }
int price()
{
    return price;
}

    public static void main(String[] args) {
        int min=100000;
        int index=0;
        _1product pro[]=new _1product[3];
        Scanner n=new Scanner(System.in);
        for(int i=0;i<pro.length;i++)
        {
            System.out.println("Enter the code for the product");
            int pcode=n.nextInt();
            System.out.println("Enter the name for the product");
            String pname=n.next();
            System.out.println("Enter the price for the product");
            int price=n.nextInt();
            pro[i]=new _1product(pcode, pname, price);
        
    
    if (pro[i].price()<min)
    {
        min=pro[i].price;
        index=i;
    }
}
    n.close();
    System.out.println("The product with least price is " +pro[index].pname+ "with price" +pro[index].price);



    }
}

 


