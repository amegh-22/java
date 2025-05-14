import java.util.Scanner;
public class _6com
{
    void add()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the real part of first number");
        int r1=sc.nextInt();
        System.out.println("Enter the img part of first number");
        int im1=sc.nextInt();
        System.out.println("Enter the real part of second number");
        int r2=sc.nextInt();
        System.out.println("Enter the img part of second number");
        int im2=sc.nextInt();
        int r=r1+r2;
        int im=im1+im2;

        System.out.println("The sum is:"+r+"+i"+im);
    }
    public static void main(String[] args) {
        _6com n=new _6com();
        n.add();
        
    }
}