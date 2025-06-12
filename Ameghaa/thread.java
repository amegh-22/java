import java.util.Scanner;
import java.io.*;
import java.lang.*;


class table extends Thread{
    int n;
    table(int number)
    {
        n=number;
    }
    public void run()
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+"*"+n+"="+(i*n));
        }

    }
}
class prime extends Thread{
    int b;
    int num;
    prime(int n,int count)
    {
        num=n;
        b=count;

    }
    boolean isprime(int a)
    {
        if(a<=1)
        return false;
        for(int i=2;i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
                return false;
        }
            return true;
        }
        void limit(int b)
        {
            int print=0;
            int number=2;
            while(print<b)
            {
                if(isprime(number))
                {
                    System.out.println(number);
                    print++;
                }
                number++;
            }
        }

    
    public void run(){
        if(isprime(num))
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
        limit(b);
    }
}


public class thread {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter the table value");
        int n=sc.nextInt();
        table t=new table(n);

        System.out.println("Enter the numbner");
       int num=sc.nextInt();
        
        System.out.println("Enter the limit: ");
        int b=sc.nextInt();
     prime e=new prime(num,b);

         

        t.start();
        e.start();
        sc.close();
    }
    
}
