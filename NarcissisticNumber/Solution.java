/*

Given N, check whether it is a Narcissistic number or not. A narcissistic number is a number that is the sum of its own digits each raised to the power of the number of digits

Input Format

Input contains a integer - N.

Constraints

0 <= N <= 109

Output Format

Print "Yes" if the number is Narcissistic number, "No" otherwise.

Sample Input 0

8208
Sample Output 0

Yes

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int M = N;
        int sum = 0;
        while(M > 0) {
            M = M / 10;
            count ++;
        }
        int temp = N;
        while(temp > 0) {
            int r = temp % 10;
            sum += Math.pow(r,count);
            temp = temp / 10;
            
        }
        if(sum == N)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}






