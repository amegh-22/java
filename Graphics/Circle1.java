package Graphics;

public class Circle1 implements Figure
{
    double radius;
    public Circle1(double r){
        radius=r;
    }
    public void area(){
        System.out.println("Area of circle: "+String.format("%.2f",(3.14*radius*radius)));
    }
}
