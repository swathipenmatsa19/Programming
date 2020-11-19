/*

Given a number - N, reverse the number.

Input Format

Input contains a integer - N.

Constraints

-1018<= N <= 1018

Output Format

Print the reversed number.

Sample Input 0

1344
Sample Output 0

4431

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long sum = 0; 
         while(N != 0) {
           long r = N % 10;
           sum = (10 * sum) + r;
           N = N / 10;
        }
        System.out.println(sum);      
    }
}





