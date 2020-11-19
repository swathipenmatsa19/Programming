/*

Print right-angled triangle pattern. See example for more details.

Input Format

First line of input contains a single integer N - the size of the triangle.

Constraints

1 <= N <= 50

Output Format

For the given integer, print the right-angled triangle pattern.

Sample Input 0

5
Sample Output 0

1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
                System.out.print(i + " ");
                int count = i;
            for(int j = 1, k = N - 1; j < i; j++, k--) {
                count += k;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}






