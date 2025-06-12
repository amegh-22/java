import java.util.Scanner;

import graphics.*;
public class mmain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        int r=sc.nextInt();
        circle c=new circle(r);
        System.out.println("enter breadth and length");
        int b=sc.nextInt();
        int l=sc.nextInt();
        rect re=new rect(b, l);

    }
    
}
