package Ameghaa;
import java.util.Scanner;

public class _3Trans {
        int m,k;
    int A[][];
    int T[][];
    void display()
    {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int m=n.nextInt();
        System.out.println("Enter the no of columns");
        int k=n.nextInt();
        A = new int[m][k];
        T=new int[k][m];
        System.out.println("Enter the values");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<k;j++)
            {
                System.out.println("A["+i+"]["+j+"]");
                A[i][j]=n.nextInt();
            }
        }
        System.out.println("Matrix is");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < k; j++) {
                System.out.print(A[i][j]+" ");
                
            }
            System.out.println(" ");
        }
            
        
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
public static void main(String[] args) {
    _3Trans s=new _3Trans();
    s.display();
}
    
}
