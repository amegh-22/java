package Ameghaa;

import java.util.Scanner;

public class _6mul {
    int A[][],B[][];
    int mul[][]=new int[100][100];
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
        

       for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                mul[i][j] = 0;
                for (int l = 0; l < k; l++) {
                    mul[i][j] += A[i][l] * B[l][j];
                }
            }
        }
           System.out.println("Resultant Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
           
    public static void main(String[] args)
    {
        _6mul d=new _6mul();
        d.display();

    }
}

