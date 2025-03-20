import java.util.Scanner;

class Matrix{
    int[][] data;
    int rows, cols;
    public Matrix(int[][] data,int rows, int cols) {
        this.data = data;
        this.rows = rows;
        this.cols = cols;
    }

    void display(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(data[i][j] + " ");
            }
                System.out.println();
        }
    }

    int[][] set_transpose(){
        int[][] transpose= new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[i][j]=data[j][i];
            }
        }
        return transpose;
    }

}

public class Matrixmain {
    void addition(Matrix m1,Matrix m2){
        int[][] result = new int[m1.rows][m1.cols];
        for(int i=0;i<m1.rows;i++){
            for(int j=0;j<m1.cols;j++){
                result[i][j] = m1.data[i][j]+m2.data[i][j];
            }
        }
        System.out.println("Addition of two matrices is:");
        Matrix m3 = new Matrix(result,m1.rows,m1.cols);
        m3.display();
    }

    void multiplication(Matrix m1,Matrix m2){
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.err.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] data1 = new int[rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                data1[i][j] = sc.nextInt();
            }
        }
        Matrix m1 = new Matrix(data1, rows, cols);
        System.out.println("The matrix is:");
        m1.display();
        System.out.println("The transpose of the matrix is:");
        int[][] transpose=m1.set_transpose();
        Matrix m1_transpose = new Matrix(transpose, rows, cols);
        m1_transpose.display();
        int[][] data2 = new int[rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                data2[i][j] = sc.nextInt();
            }
        }
        sc.close();
        Matrix m2 = new Matrix(data2, rows, cols);
        System.out.println("The matrix is:");
        m2.display();
        System.out.println("The transpose of the matrix is:");
        int[][] transpose1=m2.set_transpose();
        Matrix m2_transpose = new Matrix(transpose1, rows, cols);
        m2_transpose.display();
        Matrixmain matrix=new Matrixmain();
        matrix.addition(m1, m2);
    }
}
