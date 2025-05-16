package graphics;
public class Square implements figure
{
    double a;
    public Square(double side)
    {
        a=side;
    }
    public void Area()
    {
        System.out.println("the area of the square is"+String.format("%.2f",(a*a)));
    }
}

