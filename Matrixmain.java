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

    void multiplication(Matrix m1, Matrix m2) {
    
        if (m1.cols != m2.rows) {
            System.out.println("Matrix multiplication not possible: column count of m1 doesn't match row count of m2.");
            return;
        }

        int[][] result = new int[m1.rows][m2.cols];
    
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m2.cols; j++) {
                int sum = 0;
                for (int k = 0; k < m1.cols; k++) {
                    System.out.println(m1.data[i][k] + " * " + m2.data[k][j]);  // Print multiplication step
                    sum += m1.data[i][k] * m2.data[k][j];  // Multiply and accumulate
                }
                result[i][j] = sum;  // Store the result in the corresponding position
            }
        }
    
        System.out.println("Multiplication of two matrices is:");
        Matrix m4 = new Matrix(result, m1.rows, m2.cols);
        m4.display();
    }

    void Transpose(Matrix m1){
        System.out.println("The transpose of the matrix is:");
        int[][] transpose=m1.set_transpose();
        Matrix m1_transpose = new Matrix(transpose, m1.rows, m1.cols);
        m1_transpose.display();
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrixmain matrix=new Matrixmain();
        int option=0;
        while(option!=4){
            System.out.println("Choose an option: ");
            System.out.println("1. Addition of two matrices");
            System.out.println("2. Multiplication of two matrices");
            System.out.println("3. Transpose of a matrix");
            System.out.println("4. Exit");
            option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Enter the number of rows: ");
                    int rows = sc.nextInt();
                    System.out.println("Enter the number of columns: ");
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
                    int[][] data2 = new int[rows][cols];
                    System.out.println("Enter the elements of the matrix: ");
                    for(int i=0;i<rows;i++){
                        for(int j=0;j<cols;j++){
                            data2[i][j] = sc.nextInt();
                        }
                    }
                    Matrix m2 = new Matrix(data2, rows, cols);
                    System.out.println("The matrix is:");
                    m2.display();
                    matrix.addition(m1, m2);
                    break;
                case 2:
                    System.out.println("Enter the number of rows: ");
                    int rows1 = sc.nextInt();
                    System.out.println("Enter the number of columns: ");
                    int cols1 = sc.nextInt();
                    int[][] data3 = new int[rows1][cols1];
                    System.out.println("Enter the elements of the matrix: ");
                    for(int i=0;i<rows1;i++){
                        for(int j=0;j<cols1;j++){
                            data3[i][j] = sc.nextInt();
                        }
                    }
                    Matrix m3 = new Matrix(data3, rows1, cols1);
                    System.out.println("The matrix is:");
                    m3.display();
                    int[][] data4 = new int[rows1][cols1];
                    System.out.println("Enter the elements of the matrix: ");
                    for(int i=0;i<rows1;i++){
                        for(int j=0;j<cols1;j++){
                            data4[i][j] = sc.nextInt();
                        }
                    }
                    Matrix m4 = new Matrix(data4, rows1, cols1);
                    System.out.println("The matrix is:");
                    m4.display();
                    matrix.multiplication(m3, m4);
                break;
                case 3:
                System.out.println("Enter the number of rows: ");
                    int rows2 = sc.nextInt();
                    System.out.println("Enter the number of columns: ");
                    int cols2 = sc.nextInt();
                    int[][] data5 = new int[rows2][cols2];
                    System.out.println("Enter the elements of the matrix: ");
                    for(int i=0;i<rows2;i++){
                        for(int j=0;j<cols2;j++){
                            data5[i][j] = sc.nextInt();
                        }
                    }
                    Matrix m5 = new Matrix(data5, rows2, cols2);
                    System.out.println("The matrix is:");
                    m5.display();
                    matrix.Transpose(m5);
                break;
                case 4:
                break;
        }
    }
    sc.close();
}
}