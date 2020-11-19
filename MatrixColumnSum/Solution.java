/*


Given a matrix of size N x M. Print column-wise sum, separated by a newline.

Input Format

The first line of input contains N, M - the size of the matrix. Its followed by N lines each containing M integers - elements of the matrix.

Constraints

1 <= N, M <= 100 
-106 <= ar[i] <= 106 


Output Format

Print the column wise sum, separated by newline.

Sample Input 0

2 2
5 -1
19 8
Sample Output 0

24
7

*/




import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long [][] A = new long[N][M];
        for(int i = 0; i < N ; i++) {
            for(int j = 0; j < M ; j++) {
                A[i][j] = sc.nextLong();
            }
        }
        
        
        for(int j = 0; j < M; j++) {
            long sum = 0;
            for(int i = 0; i < N; i++) {
                sum += A[i][j];  
            }
            System.out.println(sum);
        }
    }
}







