/*


Print right-angled triangle pattern using palindrome strings. See example for more details.

Input Format

Input contains a integer N - lenght of the right angled triangle.

Constraints

1 <= N <= 26

Output Format

For the given integer N, print the right angled triangle.

Sample Input 0

5
Sample Output 0

A 
A B A 
A B C B A 
A B C D C B A 
A B C D E D C B A


*/



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char A[] = 
 {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int i = 0; i < N; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(A[j] + " ");
            }
            for(int k = i - 1; k >= 0; k--) {
                System.out.print(A[k] + " ");
            }
            System.out.println();
            
        }
    }
}









