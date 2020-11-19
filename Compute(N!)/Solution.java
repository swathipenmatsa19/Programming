/*

Given a non-negative number - N. Print N!

Input Format

Input contains a number - N.

Constraints

0 <= N <= 10

Output Format

Print Factorial of N.

Sample Input 0

5
Sample Output 0

120

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int power = 1;
        if(N == 0)
            System.out.print(power);
        else {
            for(int i = 1; i <= N; i++)
                power = power * i;
            System.out.print(power);
        }
    }
}




