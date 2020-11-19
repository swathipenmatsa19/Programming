/*


Given N, print the sum of squares of 1st N natural numbers.

Input Format

Input contains positive integer - N.

Constraints

1 <= N <= 103

Output Format

Print the sum of squares of 1st N natural numbers.

Sample Input 0

15
Sample Output 0

1240

*/

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= N; i++) {
            sum += (i * i);
        }
        System.out.println(sum);
    }
}







