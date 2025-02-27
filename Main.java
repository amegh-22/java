import java.util.Scanner;
class Shape {

    void area(double radius) {
        double area = 3.14*radius*radius;
        System.out.println("Area of circle is " + area);
    }

    void area(int length) {
        double area = length*length;
        System.out.println("Area of square is " + area);
    }

    void area(int length, int breadth) {
        int rect_area=length*breadth;
        System.out.println("Area of Rectangle is " + rect_area);
    }

    void area(double base,double height){
        double area = 0.5*base*height;
        System.out.println("Area of Triangle is " + area);
    }
}

class Main {
    public Main() {
        Shape obj = new Shape();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the square: ");
        int length=sc.nextInt();
        obj.area(length);
        System.out.println("Enter the radius of the circle: ");
        double radius=sc.nextDouble();
        obj.area(radius);
        System.out.println("Enter the length and breadth of the rectangle: ");
        int rect_l=sc.nextInt();
        int rect_b=sc.nextInt();
        obj.area(rect_l,rect_b);
        System.out.println("Enter the base and height of the triangle: ");
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        obj.area(base,height);
    }

    public static void main(String[] args) {
        Main object = new Main();
    }
}

