package Ameghaa;

import java.util.Scanner;

public class _4sym {

    int i, j;
    int A[][];
    int T[][];

    void display() {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int m = n.nextInt();
        System.out.println("Enter the no of columns");
        int k = n.nextInt();
        A = new int[m][k];
        T = new int[k][m];
        System.out.println("Enter the values");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.println("A[" + i + "][" + j + "]");
                A[i][j] = n.nextInt();
            }
        }
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
        _4sym s = new _4sym();
        s.display();

    }
}
