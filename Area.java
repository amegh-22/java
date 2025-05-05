import java.util.*;
public class Area {

    void area(double var1) {
        double var3 = 3.14 * var1 * var1;
        System.out.println("Area of circle is " + var3);
     }
  
     void area(int var1) {
        double var2 = (double)(var1 * var1);
        System.out.println("Area of square is " + var2);
     }
     void area(int var1, int var2) {
        int var3 = var1 * var2;
        System.out.println("Area of Rectangle is " + var3);
     }
  
     void area(double var1, double var3) {
        double var5 = 0.5 * var1 * var3;
        System.out.println("Area of Triangle is " + var5);
     }
     public static void main(String[] args) {
        Area Cal = new Area();
        Cal.area(5.0);
        Cal.area(4); // Square
        Cal.area(4, 5); // Rectangle
        Cal.area(3.0, 4.0); // Triangle

     }      
}
