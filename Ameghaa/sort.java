import java.util.Scanner;

public class sort {
    int size;
    String s[];
    Scanner sc=new Scanner(System.in);
    sort()
    {
        System.out.println("Enter n od strinfs");
        size=sc.nextInt();
        sc.nextLine();
        s =new String[size];
        System.out.println("Enter the string");
        for(int i=0;i<size;i++)
        {
            s[i]=sc.nextLine();

        }
    }
        void sorting()
        {
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size-i-1;j++)
                {
                    if(s[j].compareTo(s[j + 1]) > 0)
                    {
                        String temp=s[j];
                        s[j]=s[j+1];
                        s[j+1]=temp;
                    }
                }
            }
        }
    }
    

