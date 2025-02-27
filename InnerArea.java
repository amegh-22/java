
class Circle {
    void area(int radius) {
        System.out.println("Hello, World!");
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle is " + area);
    }

    void area(int length, int breadth) {
        int rect_area=length*breadth;
        System.out.println("Area of Rectangle is " + rect_area);
    }
}

class InnerArea {
    public InnerArea(int radius) {
        Circle obj = new Circle();
        obj.area(radius); // Calling the area method of Circle class with radius 5
    }

     InnerArea(int length,int breadth) {
        Circle obj1 = new Circle();
        obj1.area(length,breadth); // Calling the area method of Circle class with radius 5
    }

    public static void main(String[] args) {
        InnerArea object = new InnerArea(5);
        InnerArea object2 = new InnerArea(10,20);
    }
}
