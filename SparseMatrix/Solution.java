/*

Given a matrix of size N x M. Print whether it is a sparse matrix. A matrix containing 0 value in more than half of its elements, then it is called a sparse matrix.

Input Format

First line of input contains N, M - size of the matrix. Its followed by N lines each containing M intergers - elements of the matrix.

Constraints

1 <= N, M <= 100 
0 <= ar[i] <= 109

Output Format

Print "Yes" if given matrix is Sparse matrix, otherwise print "No".

Sample Input 0

2 3
5 0 0
0 8 0
Sample Output 0

Yes


*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] A = new int[N][M];
        int count = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
                if(A[i][j] == 0) {
                    count ++;
                }
            }
        }
        
        if(count > (N * M)/ 2)
            System.out.println("Yes");
        else    
            System.out.println("No");
    }
}




