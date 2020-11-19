/*


Given two matrices A and B of size N x M. Print sum(A+B) of matrices(A, B).
Note: Try solving it by declaring only a single matrix.

Input Format

First line of input contains N, M - size of the matrices. Its followed by 2*N lines each containing M integers - elements of the matrices. First N lines for matrix A and its followed by N lines for matrix B.

Constraints

1 <= N, M <= 100 
-106 <= ar[i] <= 106 


Output Format

Print sum(A+B) of matrices(A, B).

Sample Input 0

2 3
5 -1 3
19 8 4
4 5 -6
1 -2 12
Sample Output 0

9 4 -3
20 6 16


*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] AB = new int[N*2][M];
        int [][] sum = new int[N][M];
        for(int i = 0; i < N*2 ; i++) {
            for(int j = 0; j < M; j++) {
                AB[i][j] = sc.nextInt();
            }
        }
        
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                sum[i][j] = AB[i][j] + AB[N+i][j]; 
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }
        
    }
}







