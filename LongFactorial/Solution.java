/*

Given Number N. Print N!

Input Format

The input contains a number - N.

Constraints

0 <= N <= 20

Output Format

Print factorial of N.

Sample Input 0

3
Sample Output 0

6

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long power = 1;
        if( N == 0)
            System.out.print(power);
        else {
            for(int i = 1; i <= N; i++)
                power = power * i;
            System.out.print(power);
        }
    }
}



