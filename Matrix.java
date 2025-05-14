
import java.util.Scanner;

public class Matrix {
    int A[][],B[][],C[][];
    int row,col,i,j;
    void create(){
        System.out.println("Enter the number of rows:");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        System.out.println("Enter the number of columns:");
        col=sc.nextInt();
        A=new int[row][col];
        B=new int[row][col];
        System.out.println("Enter the elements of 1st matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                B[i][j]=sc.nextInt();
            }
        }
    }    
    void Add(){
        A=new int[row][col];
        B=new int[row][col];
        
    }
}
