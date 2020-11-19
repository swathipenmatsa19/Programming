/*

Given positive integer - N, print the sum of 1st N natural numbers.

Input Format

Input contains a positive integer - N.

Constraints

1 <= N <= 104

Output Format

Print the sum of 1st N natural numbers.

Sample Input 0

4
Sample Output 0

10

*/


import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = N * (N + 1) / 2;
        System.out.println(sum);
    }
}





