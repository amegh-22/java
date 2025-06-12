package graphics;



public class circle implements figure {
    int r;
    public circle(int radius)
    {
        r=radius;
    }
   public  void area()
    {
        System.out.println(3.14*r*r);

    }
    
}
