/*

Check whether a given number is Armstrong number.

Input Format

Input contains a integer - N.

Constraints

0 <= N <= 109

Output Format

Print "Yes" if the number is Armstrong number, "No" otherwise.

Sample Input 0

153
Sample Output 0

Yes
Explanation 0

13 + 53 + 33 = 153

*/



import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = N;
        int sum = 0;
        int n;
        while(N > 0) {
            n = N % 10;
            sum += n * n * n;
            N = N / 10;
        }
        
        if(sum == M)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}














