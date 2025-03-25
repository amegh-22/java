import java.util.Scanner;

class Symmetric{
    int[][] data;
    int rows, cols;
    public Symmetric(int[][] data,int rows, int cols) {
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

public class Symmetricmain {
    
    void Transpose(Matrix m1){
        System.out.println("The transpose of the matrix is:");
        int[][] transpose=m1.set_transpose();
        Matrix m_transpose = new Matrix(transpose, m1.rows, m1.cols);
        m_transpose.display();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrixmain matrix=new Matrixmain();

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
        sc.close();
    }
}
