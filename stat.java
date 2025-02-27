class A {
    static int c;
    
    static void count()
    {
        c=c+1;
        
    }
    static void display()
    {
        System.out.println(c);

    }

}
class stat{
    public static void main(String[] args)
{
    A.c=0;
    A.display();
    A.count();
    A.display();
    A.count();
    A.display();
    A.count();
    A.display();

}
}
