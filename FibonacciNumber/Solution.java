/*

For a given positive integer - N. Compute Nth fibonacci number.

Input Format

Input contains a positive integer - N.

Constraints

1 <= N <= 20

Output Format

For given input, print the Nth fibonacci number.

Sample Input 0

4
Sample Output 0

3
Explanation 0

The fibonacci series:
1, 1, 2, 3, 5, 8,......
At 4th position we have 3.

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int first = 1;
        int second = 1;
        if(N == 1 || N == 2)
            System.out.print(1);
        else {
            int temp = 0;
            for(int i = 3; i<= N; i++) {
                temp = first + second;
                first = second;
                second = temp;
            }
            System.out.print(temp);
        }
    }
}






