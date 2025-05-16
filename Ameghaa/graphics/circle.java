package graphics;

 public class circle implements figure
{
double r;
public circle(double rad)
{
    r=rad;
}
public void Area()
{

    System.out.println("the area of the circle"+String.format("%.2f", (3.14*r*r)));
}

    
}
