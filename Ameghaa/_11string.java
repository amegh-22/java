package amegha;
import java.util.*;

public class _11string {
    Scanner sc=new Scanner(System.in);
    String s[];
    int size;
    void string()
    {
        System.out.println("Enter the size of string");
        size=sc.nextInt();
        s=new String[size];
        System.out.println("Enter the strings");
        for(int i=0;i<size;i++)
        {
            s[i]=sc.next();
        }
        System.out.println("Before sorting");
        for(int i=0;i<size;i++)
        {
            System.out.print(s[i]+" ");

        }
        System.out.println("\nAfter sorting");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(s[j].compareTo(s[j+1])>0)
                {
                    String temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }

        }
             for(int i=0;i<size;i++)
        {
            System.out.print(s[i]+" ");

        }

    }
    public static void main(String[] args) {
        _11string g=new _11string();
        g.string();
    }


    
}
