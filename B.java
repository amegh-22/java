 class A {
    int x,y;
    A(int a,int b)
    {
        x=a;
        y=b;
    }
    void display()
    {
        System.out.println("the value is" + x +" "+ y );
    }

        
}
class B extends A{
    int z;
    B(int a, int b,int c)
    {
        super(a,b);
        z=c;
        System.out.println("the value is " + z);

    }
    void display()
    {
        super.display();
        System.out.println("this is derived");
    }
    public static void main(String[] args) {
        B h=new B(5,6,7);
        h.display();
    }
    }

