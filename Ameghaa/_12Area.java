package amegha;

public class _12Area {
    int r,l,breadth;
    float s;
    void area(double  r)
    {
        double A=3.14*r*r;
        System.out.println("Area of cicle with radius"+r+ "is"+A);

    }
    void area(int s)
    {
        int A=s*s;
        System.out.println("Area of cicle with radius"+s+ "is"+A);
    }
    void area(int l,int b)
    {
        int A=l*b;
        System.out.println("Area of cicle with radius"+r+ "is"+A);


    }
    public static void main(String[] args) {
        _12Area g=new _12Area();
        g.area(3);
        g.area(4);
        g.area(4,3);

    }

    
}
