/*

Print half diamond pattern using '*'. See example for more details.

Input Format

Input contains a single integer N.

Constraints

1 <= N <= 50

Output Format

For the given integer, print the half diamond pattern.

Sample Input 0

3
Sample Output 0

*
**
***
**
*

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = N - 1; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}







