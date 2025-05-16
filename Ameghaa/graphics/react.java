package graphics;
public class react implements figure{
    double l,b;
    public react(double len,double brea)
    {
        l=len;
        b=brea;
    }
   public void Area()
   {
    System.out.println("the area of the rectangle"+String.format("%.2f",(l*b) ));
   }

}
