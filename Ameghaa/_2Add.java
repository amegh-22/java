package Ameghaa;
import java.util.Scanner;

public class _2Add {
    int m,o,k,p;
    int A[][],B[][];
    int sum[][]=new int[100][100];
void display()
{
    Scanner n=new Scanner(System.in);
    System.out.println("Enter the no of rows for first matrix");
    int m=n.nextInt();
    System.out.println("Enter the no of column first matrix");
    int k=n.nextInt();
    A=new int[m][k];
    System.out.println("Enter the no of rows for second matrix");
    int o=n.nextInt();
    System.out.println("Enter the no of column second matrix");
    int p=n.nextInt();
    B=new int[o][p];
    if(m==o && k==p)
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<k;j++)
            {
                System.out.print("A["+i+"]"+"["+j+"]=");
                A[i][j]=n.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<k;j++)
            {
                System.out.print("B["+i+"]"+"["+j+"]=");
                B[i][j]=n.nextInt();
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<k;j++)
            {
                sum[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.println("Add");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<k;j++)
            {
                System.out.print(sum[i][j]+" ");
               
            }
            System.out.print("\n");
        }


    }

    else{
        System.out.println("cannot add the matrix");
    }
}

public static void main (String args[])
{
    _2Add g=new _2Add();
g.display();
}
}

