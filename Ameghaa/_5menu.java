package Ameghaa;

import java.util.Scanner;

public class _5menu {
    int m;
    int k,q;
    int A[][];
    int B[][];
    int sum[][];
    void create()
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
    }
    void Add()
    {
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
    void mul()
    {
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                mul[i][j] = 0;
                for (int l = 0; l < k; l++) {
                    mul[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }
     void trans()
        {
             System.out.println("Tranpose of the matrix is");
        for(int j=0;j<k;j++)
        {
            for(int i=0;i<m;i++)
            {
                T[j][i]=A[i][j];
            }
        }
          for(int j=0;j<k;j++)
        {
            for(int i=0;i<m;i++)
            {
               System.out.print(T[j][i]+ " ");
            }
            System.out.println(" ");
        }
    }

    }
    void sym()
    {
         for (int j = 0; j < k; j++) {
            for (int i = 0; i < m; i++) {
                T[j][i] = A[i][j];
            }
        }
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(T[j][i] + " ");
            }
            System.out.println(" ");
        }
        boolean flag = true;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {
                if (T[i][j] != A[i][j]) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag == false) {
            System.out.println("Not Symmetric");
        } else {
            System.out.println("Symmetric");
        }
    }

    
    public static void main(String[] args) {
        
    }

    
}
