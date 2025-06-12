import java.io.*;
import java.lang.*;
import java.util.*;

class fib implements Runnable{
    int n;
    fib(int limit)
    {
        n=limit;

        
    }
    public void run()
    {
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<=n;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }

}
class even implements Runnable{
    int a;
    int b;
    even(int start,int end)
    {
        a=start;
        b=end;

    }
    public void run()
    {
        for(int i=a;i<=b;i++)
        {
            if(i%2==0)
            {
                System.out.println("even" +i+"\t");
            }
        }
    }
}

public class runnable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit for fibo");
        int n=sc.nextInt();
        fib f=new fib(n);
             Thread t1=new Thread(f);

        System.out.println("Enter the starting and ending range");
        int a=sc.nextInt();
        int b=sc.nextInt();
   
     
        even e=new even(a,b);
        Thread t2=new Thread(e);
           t1.start();
        t2.start();
        
    }
    
}
