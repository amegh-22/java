
import java.util.Scanner;

public class _5menu {
    int m, k, o, p;

    int A[][];
    int B[][];
    int sum[][];
    int mul[][];
    int T[][];
    Scanner n;

    void create() {
        n = new Scanner(System.in);

        System.out.println("Enter the no of rows for first matrix");
        m = n.nextInt();
        System.out.println("Enter the no of column first matrix");
        k = n.nextInt();
        A = new int[m][k];

        System.out.println("Enter the no of rows for second matrix");
        o = n.nextInt();
        System.out.println("Enter the no of column second matrix");
        p = n.nextInt();
        B = new int[o][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("A[" + i + "]" + "[" + j + "]=");
                A[i][j] = n.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("B[" + i + "]" + "[" + j + "]=");
                B[i][j] = n.nextInt();
            }
        }
    }

    void Add() {
        sum = new int[m][k];
        if (m == o && k == p) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < k; j++) {
                    sum[i][j] = A[i][j] + B[i][j];
                }
            }
            System.out.println("Add");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < k; j++) {
                    System.out.print(sum[i][j] + " ");

                }
                System.out.print("\n");
            }
        }

    }

    void mul() {
        mul = new int[m][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                mul[i][j] = 0;
                for (int l = 0; l < p; l++) {
                    mul[i][j] += A[i][l] * B[l][j];
                    System.out.println("mul[" + i + "][" + j + "] updated to: " + mul[i][j]); // Debugging step
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(mul[i][j] + " ");

            }
            System.out.print("\n");
        }

    }

    void trans() {
        int T[][] = new int[100][100];
        System.out.println("Tranpose of the matrix is");
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
    }

    void sym() {
        T = new int[k][m];
        if (m == k) {
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
    }

    public static void main(String[] args) {
        _5menu g = new _5menu();
        g.create();
        int ch;
 
        while (true) {
                   System.out.println("Enter your choice\n1.Add\n2.Multiply\n3.Transpose\n4.Symmetric\n5.Exit");
        ch = g.n.nextInt();
            switch (ch) {
                case 1:
                    g.Add();

                    break;
                case 2:
                    g.mul();

                    break;
                case 3:
                    g.trans();

                    break;
                case 4:
                    g.sym();

                    break;
                case 5:
                    System.out.println("Exiting....");
                    System.exit(0);

                default:
                    System.out.println("invalid choice");
                    break;
            }

        }

    }

}