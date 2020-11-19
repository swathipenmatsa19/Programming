/*

Given a matrix of size N x M. Print transpose of the matrix.

Input Format

First line of input contains N, M - the size of the matrix. Its followed by N lines each containing M integers - elements of the matrix.

Constraints

1 <= N, M <= 100 
-109 <= ar[i] <= 109 


Output Format

Print the transposed matrix.

Sample Input 0

2 2
5 -1
19 8
Sample Output 0

5 19
-1 8


*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] A = new int[N][M];
        int [][] B = new int[M][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                B[i][j] = A[j][i];
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }
}



